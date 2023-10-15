<template>
    <div class="w-100 d-flex justify-content-center">
         <img src="../../../assets/images/wine-back.jpg">
    </div>
 </template>
 
 <script lang="ts">
  export default {
     name: "RightArticle",
  };
 </script>
 
 <style scoped>
     img {
      border-radius: 5%;
      width: 470px;
      height: 300px;
     }
     @media(max-width: 1200px) {
        img {
            width: 400px;
            height: 360px;
        }
     }
     @media(max-width: 990px) {
       img {
        width: 90%;
        height: auto;
       }
     }
 </style>