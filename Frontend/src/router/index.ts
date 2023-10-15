import { createRouter, createWebHistory } from "vue-router";
import Home from "../views/Home.vue";
import Login from "../views/Login.vue";
import Wines from "../views/Wines.vue";
import winePreview from "@/components/wines-view-components/winePreview.vue";
import AddWineView from "@/views/AddWineView.vue";

const routes = [
   {
     path: '',
     name: "Home",
     component: Home
   },
   {
    path: "/login",
    name: "Login",
    component: Login
   },
   {
    path: "/wines",
    name: "Wines",
    component: Wines
   },
   {
    path: '/wine/preview/:id',
    name: "winePreview",
    component: winePreview,
    props: true,
   },
   {
    path: "/wine/add/",
    name: "AddWine",
    component: AddWineView
   },
];

const router = createRouter({
    history: createWebHistory(),
    routes
});

export default router;