<template>
    <div class="container-fluid d-flex justify-content-center">
        <h1>A taste to remember</h1>
    </div>
</template>

<script lang="ts">
export default {
    name: "WelcomeArticle",
};
</script>

<style scoped>
   h1 {
    font-size: 3em;
    font-family: 'Dancing Script', cursive;
   }
   @media(max-width: 380px) {
     h1 {
        font-size: 2.3em;
     }
   }
   @media(max-width: 280px) {
     h1 {
        font-size: 2em;
     }
   }
</style>