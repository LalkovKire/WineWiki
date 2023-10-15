<template>
    <div class="main-container w-100">
       <div class="container custom-container  h-100 w-100 ">
         <Header></Header>
       </div>
    </div>
 </template>
 
 <script lang="ts">
 import Header from '@/components/home-view-components/Header.vue';
 
 export default {
     name: "Login",
     components: {
         Header,
     }
 };
 </script>
 
 <style scoped>
     .main-container {
         height: 100vh;
     }
     .custom-container {
         --bs-gutter-x: 0;
     }
 </style>