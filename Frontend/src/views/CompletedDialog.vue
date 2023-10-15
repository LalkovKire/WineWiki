<template>
    <div class="main-container w-100">
        <div class="container custom-container  h-100 w-100">
            <Header></Header>
            <Whitespace />
            <div class="w-100 d-flex justify-content-center align-items-center">
                <div class="d-flex justify-content-center flex-column align-items-center custom-div">
                    <h1>Successful</h1>
                    <Whitespace />
                    <RouterLink to="/wines" class="nav-link custom-route">Close</RouterLink>
                </div>
            </div>
            <Whitespace v-for="i in 4"/>
            <Footer />
        </div>
    </div>
</template>

<script lang="ts">
import { mapGetters } from 'vuex';
import Header from '@/components/home-view-components/Header.vue';
import Footer from '@/components/home-view-components/Footer.vue';
import Whitespace from '@/components/Whitespace.vue';

export default {
    name: "CompletedDialog",
    computed: {
        ...mapGetters([
            "latestWine"
        ])
    },
    components: {
        Header,
        Footer,
        Whitespace
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
    h1 {
        font-family: 'Poppins', sans-serif;
    }
    .custom-div {
        width: 60%;
    }
    .custom-route {
      border-radius: 5px;
      display: flex;
      justify-content: center;
      align-items: center;
      width: 120px;
      height: 45px;
      background-color: rgba(204, 28, 28, 0.7);
      color: white;
      font-family: 'Poppins', sans-serif;
      margin: 20px;
   }
</style>