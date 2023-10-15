<template>
   <div class="w-100 h-100 d-flex custom-div">
       <LeftArticle />
       <RightArticle />
   </div>
</template>

<script lang="ts">
import LeftArticle from "@/components/home-view-components/middle-section-components/LeftArticle.vue";
import RightArticle from "@/components/home-view-components/middle-section-components/RightArticle.vue";

 export default {
    name: "MiddleSection",
    components: {
       LeftArticle,
       RightArticle
    }
 };
</script>

<style scoped>
   @media(max-width: 990px) {
      .custom-div {
         flex-direction: column;
      }
   }
</style>