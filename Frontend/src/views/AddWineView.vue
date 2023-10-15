<template>
    <div class="main-container w-100">
      <div class="container custom-container  h-100 w-100 ">
        <Header></Header>
        <Whitespace />
        <WineAddManufForm v-if="showManufacturerView" @formSubmitted="hideManufacturerForm"></WineAddManufForm>
        <WineAddForm v-if="!showManufacturerView"></WineAddForm>
        <Whitespace v-for="i in 3" v-if="showManufacturerView"/>
        <Whitespace />
        <Footer />
      </div>
    </div>
</template>

<script lang="ts">
import Header from '@/components/home-view-components/Header.vue';
import Footer from '@/components/home-view-components/Footer.vue';
import Whitespace from '@/components/Whitespace.vue';
import WineAddManufForm from "@/components/form-view-components/WineAddManufForm.vue"
import WineAddForm from '@/components/form-view-components/WineAddForm.vue';
export default {
    name: "AddManufView",
    components: {
        Header,
        Footer,
        Whitespace,
        WineAddManufForm,
        WineAddForm
    },
    data() {
        return {
            showManufacturerView: true
        };
    },
    methods: {
        hideManufacturerForm(){
            this.showManufacturerView = false
        }
    }
}
</script>

<style scoped>
    .custom-container {
        --bs-gutter-x: 0;
    }
    .custom-main-section{
         min-height: 600px;
         width: 100%;
    }
</style>