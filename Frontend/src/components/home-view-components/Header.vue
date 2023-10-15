<template>
    <nav class="navbar navbar-expand-lg custom-header">
  <div class="container-fluid">
    <RouterLink to="/"  ><img src="../../assets/images/logo.png" height="25" width="80"></RouterLink>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse justify-content-end" id="navbarSupportedContent">
      <ul class="navbar-nav  mb-2 mb-lg-0">
        <li class="nav-item cs-item">
         <RouterLink to="/" class="nav-link custom-route" >Home</RouterLink>
        </li>
        <li class="nav-item cs-item">
         <RouterLink to="/wines" class="nav-link custom-route" >Search</RouterLink>
        </li>
        <li class="nav-item cs-item">
          <RouterLink to="/wine/add/" class="nav-link custom-route">Add</RouterLink>
        </li>
        <li class="nav-item cs-item">
         <RouterLink to="/cart" class="nav-link custom-route"><span class="material-symbols-outlined">shopping_cart</span></RouterLink>
        </li>
        <li class="nav-item cs-item">
          <RouterLink to="/login" class="nav-link custom-route">Sign In</RouterLink>
        </li>
      </ul>
    </div>
  </div>
</nav>
</template>

<script lang="ts">
   export default {
    name: "Header",
   }
</script>

<style scoped>
.cs-item {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 75px;
  height: 45px;
}
.nav-link {
   height: 100%;
}
 .navbar {
   --bs-navbar-toggler-focus-width: 0 !important;
 }
   .custom-header {
     box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
     background-color: rgba(165, 22, 22, 0.64) !important;
     padding: 0;
   }
   .custom-ul {
      gap: 20px;
   }
    .custom-route {
      display: flex;
      justify-content: center;
      align-items: center;
      width: 100%;
      height: 100%;
      color: white;
   }
   .custom-route:hover {
      background-color: rgba(192, 143, 143, 0.833);
   }
   
</style>