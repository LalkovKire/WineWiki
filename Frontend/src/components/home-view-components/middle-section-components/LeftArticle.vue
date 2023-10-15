<template>
    <div class="w-100 d-flex p-2 custom-div">
         <div class="fs-5">
              <p>Wine, a timeless elixir cherished for centuries, has been a source of fascination, pleasure,
                 and tradition across cultures and generations. This remarkable beverage, crafted from the humble grape, is more
                  than just a drink; it's a gateway to a world of sensory delights, history, and craftsmanship. Wine's roots dig deep into history, dating back over 6,000 years to ancient Mesopotamia. It has journeyed through time, nourishing the hearts and souls of civilizations from the Egyptians to the Greeks and Romans, who celebrated it as the nectar of the gods.</p>
         </div>
    </div>
 </template>
 
 <script lang="ts">
  export default {
     name: "LeftArticle",
  };
 </script>
 
 <style scoped>
    p {
        font-family: 'Poppins', sans-serif;
        text-align: justify;
    }
    @media(max-width: 500px) {
       .custom-div {
         padding: 20px !important;
       }
    }
 </style>