<template>
  <div class="d-flex w-100 custom-div">
    <button class="button button-edit">Edit</button>
    <button class="button button-delete">Delete</button>
  </div>
</template>

<script lang="ts">
   export default {
      name: "wineAdminButtons",
   }
</script>

<style scoped> 
   .custom-div {
    margin-top: 15px;   
   }
   .button-edit {
    margin-right: 50px;
    background-color: rgba(65, 189, 181, 0.937);
   }
   .button {
     border-radius: 5px;
      width: 105px;
      height: 35px;
      border: none;
   }
   .button-delete {
    background-color: rgba(224, 21, 21, 0.748);
   }
</style>