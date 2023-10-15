<template>
  <div class="container w-50 d-flex justify-content-center align-items-center flex-column custom-div">
    <h1>Add Wine</h1>
    <form class="row g-3" @submit.prevent="addWine">
        <div class="custom-line"></div>
        <div class="col-md-6">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" v-model="fields.name">
            <p v-if="errors.invalidName" class="text-error">*Please enter a valid name.</p>
        </div>
        <div class="col-md-6">
            <label for="price" class="form-label">Price</label>
            <input type="number" class="form-control" v-model="fields.price">
            <p v-if="errors.invalidPrice" class="text-error">*Please enter a valid price.</p>
        </div>
        <div class="col-12">
            <label for="description" class="form-label">Description</label>
            <textarea type="text" class="form-control" v-model="fields.description"></textarea>
            <p v-if="errors.invalidDescription" class="text-error">*Please enter at least one word for description.</p>
        </div>
        <div class="col-md-6">
            <label for="picture" class="form-label">ImageURL</label>
            <input type="url" class="form-control" v-model="fields.imgUrl" placeholder="https://">
            <p v-if="errors.invalidImgUrl" class="text-error">*Please enter a valid url.</p>
        </div>
        <div class="col-md-6">
            <label for="Quantity" class="form-label">Quantity</label>
            <input type="number" class="form-control" v-model="fields.quantity">
            <p v-if="errors.invalidQuantity" class="text-error">*Please enter a valid number for quantity.</p>
        </div>
        <small id="emailHelp" class="form-text text-muted">*Note: images are stored as url's, make sure the image is transparent for better estethics.</small>
        <div class="col-12 d-flex justify-content-center align-items-center">
            <button @click="addWine" type="submit" class="btn btn-primary custom-submit-btn">Submit</button>
        </div>
        <div class="custom-blank-space"></div>
    </form>
  </div>
</template>

<script lang="ts">
import store from '@/store';
import { mapGetters } from 'vuex';

export default {
    name: "WineAddForm",
    data() {
        return {
             fields: {
                  name: "",
                  price: 0,
                  quantity: 0,
                  imgUrl: "",
                  description: ""
             },
             errors: {
                invalidName: false,
                invalidPrice: false,
                invalidQuantity: false,
                invalidImgUrl: false,
                invalidDescription: false
             }
        }
    },
    computed: {
        ...mapGetters([
            "manufacturerList",
            "latestManufacturer"
        ])
    },
    methods: {
        async addWine() {
                this.errors.invalidName = this.fields.name === "";
                this.errors.invalidPrice = this.fields.price <= 0;
                this.errors.invalidQuantity = this.fields.quantity <= 0;
                this.errors.invalidImgUrl = !this.isValidUrl(this.fields.imgUrl);
                this.errors.invalidDescription = this.fields.description.trim() === "";
                console.log(this.manufacturerList);
                if (!this.errors.invalidName && !this.errors.invalidPrice && !this.errors.invalidQuantity && 
                !this.errors.invalidImgUrl && !this.errors.invalidDescription) {
                    const manufacturer = this.latestManufacturer;
                    let wine = {
                        name: this.fields.name,
                        quantity: this.fields.quantity,
                        description: this.fields.description,
                        manufacturer: manufacturer.id
                    };
                    store.dispatch("addWine",wine);
                    this.resetFileds();
                    this.$router.push("/wine/add/dialog");
                }
        },
        resetFileds() {
            this.fields.name = "";
            this.fields.description = "";
            this.fields.quantity = 0;
            this.fields.imgUrl = "",
            this.fields.price = 0;
            this.errors.invalidName = false;
            this.errors.invalidPrice = false;
            this.errors.invalidQuantity = false;
            this.errors.invalidImgUrl = false;
            this.errors.invalidDescription = false;
        },
        isValidUrl(url: any) {
            try {
                new URL(url);
                return true;
            } catch (_) {
                return false;
            }
        }
    }
}
</script>

<style scoped>
    .custom-line {
        width: 100%;
        height: 2px;
        background: rgb(166,225,117);
        background: linear-gradient(90deg, rgba(166,225,117,1) 12%, rgba(125,226,218,1) 47%, rgba(24,169,198,1) 74%);
        margin-bottom: 25px;
        margin-top: 35px;
    }
    h1 {
        font-family: 'Poppins', sans-serif;
    }
    .custom-submit-btn {
        width: 170px;
        height: 39px;
    }
    .custom-blank-space {
        width: 100%;
        height: 20px;
    }
    .text-error {
        color: red;
    }
    @media(max-width: 1200px) {
          .custom-div {
              width: 75% !important;
          }
    }
</style>