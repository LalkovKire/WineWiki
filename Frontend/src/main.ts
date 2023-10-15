import './assets/main.css'
import  "bootstrap/dist/css/bootstrap.css"
import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

const app = createApp(App).use(store).use(router)
app.mount("#app")
