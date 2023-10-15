<template>
  <div class="container custom-div d-flex flex-column float-start">
      <div class="w-100 d-flex bg-light justify-content-center align-items-center custom-top">
         <div class="custom-img">
         </div>
      </div>
      <div class="w-100 bg-light p-2 custom-bottom">
        <h5>{{ wine.name }}</h5><br>
        <div class="d-flex w-100 justify-content-around align-content-center">
          <p>Price:&nbsp 0.0$</p>
          <span class=" w-50 h-100"></span>
        </div> 
        <div class="d-flex w-100 justify-content-around align-content-center">
          <p>Quantity:&nbsp {{ wine.quantity }}</p>
          <span class=" w-50 h-100"></span>
        </div>
        <div class="d-flex w-100 justify-content-around align-content-center">
            <button class="button button-one">Add to cart</button>
            <RouterLink :to="'/wine/preview/' + wine.id"
            class="button button-two d-flex justify-content-center align-items-center">Preview</RouterLink>
        </div>
      </div>
  </div>
</template>

<script lang="ts">
export default {
    name: "wineProduct",
    props: ["wine"],
}
</script>

<style scoped>
   .custom-div {
       margin: 12px;
       width: 300px;
       height: 360px;
   }
   .custom-img {
     box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
     background-color: rgba(128, 128, 128, 0.233);
     border: 0.5px solid rgba(169, 171, 171, 0.315);
     border-radius: 100%;
     width: 50%;
     height: 70%;
     background-image: url("https://images.ctfassets.net/6jpeaipefazr/1CVNQzcDoA2EAcGQkKkcSS/1ea6c30515972dded5f890356d1eda8e/villa-annaberta-amarone-della-valpolicella-761359.png?fm=avif&q=65&w=400&h=400&fit=pad");
     background-size: cover;
     background-repeat: round;
     transition: transform 0.7s ease-in-out;
   }
   .custom-img:hover {
     cursor:pointer;
     transform: scale(1.1);
   }

   h5 {
    text-align: center;
    font-family: 'Dancing Script', cursive;
   }

   p{
    text-align: left;
    font-size: 0.9em;
    font-family: 'Poppins', sans-serif;
   }
   .custom-top {
     height: 40%;
   }
   .custom-bottom {
    height: 60%;
   }
   .button {
     border-radius: 5px;
      width: 105px;
      height: 35px;
      border: none;
   }
   .button-one {
    background-color: rgba(124, 207, 28, 0.749);
   }
   .button-two {
    text-decoration: none;
    color: black;
    background-color: rgba(95, 218, 201, 0.619);
   }
   @media(max-width: 1400px) {
      .custom-div {
       margin: 12px;
       width: 340px;
       height: 360px;
       }
   }
   @media(max-width: 1200px) {
      .custom-div {
       margin: 10px;
       width: 290px;
       height: 340px;
       }
   }
    @media(max-width: 992px) {
      .custom-div {
       margin: 13px;
       width: 310px;
       height: 340px;
       }
   }
    @media(max-width: 767px) {
      .custom-div {
       float: none !important;
       margin-bottom: 25px;
       width: 70%;
       height: 340px;
       }
       p {
         margin-left: 9px;
       }
   }
   @media(max-width: 575px) {
      .custom-div {
       float: none !important;
       margin-bottom: 25px;
       width: 60%;
       height: 340px;
       }
   }
   @media(max-width: 500px) {
      .custom-div {
       width: 70%;
       }
   }
   @media(max-width: 400px) {
      .custom-div {
       width: 90%;
       height: 370px;
       }
   }
   @media(max-width: 300px) {
      .custom-div {
       width: 100%;
       height: 370px;
       }
       .button {
          width: 90px;
          height: 30px;
          font-size: 12px;

       }
   }
</style>