<template>
   <div class="main-container w-100">
       <div class="container custom-container  h-100 w-100 ">
           <Header></Header>
           <Whitespace />
           <div class="d-flex flex-column justify-content-center align-items-center w-100 flex-grow-1 custom-wrapper">
              <div class="container custom-main-section">
                 <wineProduct v-for="wine in wineList" :key="wine.name" :wine="wine"></wineProduct>
                 <wineProduct v-for="wine in wineList" :key="wine.name" :wine="wine"></wineProduct>
                 <wineProduct v-for="wine in wineList" :key="wine.name" :wine="wine"></wineProduct>
                 <wineProduct v-for="wine in wineList" :key="wine.name" :wine="wine"></wineProduct>
              </div>
              <Whitespace />
              <Whitespace />
           </div>
           <Footer></Footer>
       </div>
   </div>
</template>

<script lang="ts">
import store from '@/store';
import { mapGetters } from 'vuex';
import Header from '@/components/home-view-components/Header.vue';
import Whitespace from '@/components/Whitespace.vue';
import Footer from '@/components/home-view-components/Footer.vue';
import wineProduct from '@/components/wines-view-components/wineProduct.vue';

export default {
    name: "Wines",
    created(){
        store.dispatch("getWineList");
    },
    computed: {
       ...mapGetters([
            "wineList"
       ]),
    },
    components: {
       Header,
       Whitespace,
       Footer,
       wineProduct
    }
};
</script>

<style scoped>
   .custom-container {
        --bs-gutter-x: 0;
    }
    .custom-main-section{
         min-height: 600px;
         width: 100%;
    }
    @media(max-width: 767px) {
     .custom-main-section {
         display: flex;
         justify-content: center;
         align-items: center;
         flex-direction: column;
     }
   }
</style>