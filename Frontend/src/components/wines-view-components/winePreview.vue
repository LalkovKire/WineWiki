<template>
     <div class="main-container w-100">
      <div class="container custom-container  h-100 w-100 ">
        <Header></Header>
        <Whitespace />
        <div v-if="fetchedWine" class="w-100 d-flex justify-content-center align-items-center flex-column custom-section">
            <img :src="fetchedWine.url"
             class="custom-img"> <br><br>
            <h4>{{ fetchedWine.name }}</h4>
            <Whitespace />
            <div class="w-50 custom-preview-container">
              <h6>Description: &nbsp&nbsp&nbsp</h6><p>{{ fetchedWine.description }}</p>
              <div class="d-flex"><h6>Manufacturer:&nbsp&nbsp&nbsp</h6><p class="custom-txt">{{ fetchedWine.manufacturer.name }}</p></div>
              <div class="d-flex"><h6>Country:&nbsp&nbsp&nbsp</h6><p class="custom-txt">{{ fetchedWine.manufacturer.country }}</p></div>
              <div class="d-flex"><h6>Price:&nbsp&nbsp&nbsp</h6><p class="custom-txt">${{ fetchedWine.price}}</p></div>
              <div class="d-flex"><h6>Quantity:&nbsp&nbsp&nbsp</h6><p class="custom-txt">{{ fetchedWine.quantity }}</p></div>
              <div class="d-flex w-100">
                   <button class="button button-one">Add to cart</button>
                   <button class="button button-two" @click="goBack">Back</button>
              </div>
              <wineAdminButtons />
            </div>
        </div>
        <Whitespace />
        <Whitespace />
        <Footer></Footer>
      </div>
   </div>
</template>

<script lang="ts">
import store from '@/store';
import { mapGetters, mapActions } from 'vuex';
import Header from '../home-view-components/Header.vue';
import Whitespace from '../Whitespace.vue';
import Footer from '../home-view-components/Footer.vue';
import wineAdminButtons from './wineAdminButtons.vue';

export default {
    name: "winePreview",
    components: {
       Header,
       Whitespace,
       Footer,
       wineAdminButtons
    },
    created() {
       store.dispatch('getWineByID', this.$route.params.id);
       console.log(this.fetchedWine);
    },
    computed: {
       ...mapGetters([
          "fetchedWine"
       ]),
    },
    methods: {
        goBack() {
            this.$router.go(-1);
        }
    }
};
</script>

<style scoped>
    .custom-container {
        --bs-gutter-x: 0;
    }
    .custom-img {
        max-width: 220px;
        max-height: 300px;
    }

    h4 {
        font-family: 'Dancing Script', cursive;
    }
    p {
        font-size:1em;
        font-weight: 600;
        font-family: 'Bitter', serif;
    }
    .custom-txt {
         line-height: 20px;
    }

    h6 {
        text-align: left;
    }
    .button {
     border-radius: 5px;
      width: 105px;
      height: 35px;
      border: none;
   }
   .button-one {
    margin-right: 50px;
    background-color: rgba(124, 207, 28, 0.749);
   }
   .button-two {
    background-color: rgba(160, 160, 147, 0.71);
   }

   @media(max-width: 500px) {
      .custom-preview-container{
        width: 90% !important;
      }
   }
</style>