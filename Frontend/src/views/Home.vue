<template>
   <div class="main-container w-100">
      <div class="container custom-container  h-100 w-100 ">
        <Header></Header>
        <Whitespace />
        <WelcomeArticle />
        <Whitespace />
        <MiddleSection />
        <Whitespace />
        <div class=" w-100 d-flex justify-content-center align-items-center">
          <RouterLink to="/wines" class="nav-link custom-link d-flex justify-content-center align-items-center">Check Wines</RouterLink>
        </div>
        <Whitespace />
        <Footer />
      </div>
   </div>
</template>

<script lang="ts">
import Header from '@/components/home-view-components/Header.vue';
import WelcomeArticle from '@/components/home-view-components/WelcomeArticle.vue';
import Whitespace from '@/components/Whitespace.vue';
import MiddleSection from '@/components/home-view-components/MiddleSection.vue';
import Footer from '@/components/home-view-components/Footer.vue';

export default {
    name: "Home",
    components: {
        Header,
        WelcomeArticle,
        Whitespace,
        MiddleSection,
        Footer
    }
};
</script>

<style scoped>
    .custom-container {
        --bs-gutter-x: 0;
    }
    .custom-link {
        font-family: 'Poppins', sans-serif;
        color: white;
        box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
        border-radius: 20px;
        height: 50px;
        width: 150px;
        background-color: rgba(165, 22, 22, 0.64);
    }
</style>