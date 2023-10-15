<template>
    <div class="container w-50 d-flex justify-content-center align-items-center flex-column custom-div">
      <h1>Add Manufacturer</h1>
      <form class="row g-3" @submit.prevent="addManufacturer">
          <div class="custom-line"></div>
          <div class="col-md-6">
              <label for="name" class="form-label">Name</label>
              <input type="text" class="form-control" v-model="fields.name">
              <p v-if="!errors.isValidName" class="text-error">*Please enter a valid manufacturer name.</p>
          </div>
          <div class="col-md-6">
              <label for="Country" class="form-label">Country</label>
              <input type="text" class="form-control" v-model="fields.country">
              <p v-if="!errors.isValidCountry" class="text-error">*Please enter a valid country name.</p>
          </div>
          <div class="col-12 d-flex justify-content-center align-items-center">
              <button @click="addManufacturer" type="submit" class="btn btn-primary custom-submit-btn">Next</button>
          </div>
      </form>
    </div>
  </template>
  
  <script lang="ts">
  import store from '@/store';
  
  export default {
      name: "WineAddForm",
      data() {
          return {
               fields: {
                    name: "",
                    country: "",
               },
               errors: {
                   isValidName: true,
                   isValidCountry: true
               }
          };
      },
      methods: {
          addManufacturer() {
            if (this.fields.name === "" || !/^[a-zA-Z ]+$/.test(this.fields.name)) {
                this.errors.isValidName = false;
            } else {
                this.errors.isValidName = true;
            }

            if (this.fields.country === "" || !/^[a-zA-Z ]+$/.test(this.fields.country)) {
                this.errors.isValidCountry = false;
            } else {
                this.errors.isValidCountry = true;
            }
            if (this.errors.isValidName && this.errors.isValidCountry) {
            const manufac = {
                name: this.fields.name,
                country: this.fields.country
            };
            store.dispatch("addManufacturer",manufac);
            this.fields.name = "",
            this.fields.country = "",
            this.$emit('formSubmitted');
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
      .text-error {
         color: red;
      }
      @media(max-width: 1200px) {
            .custom-div {
                width: 75% !important;
            }
      }
  </style>