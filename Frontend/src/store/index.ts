import axios from "axios";
import { createStore } from "vuex"
import Vuex from 'vuex'
import wine from "./modules/wine";
import manufacturers from "./modules/manufacturers";

export default createStore({
    modules: {
        wine,
        manufacturers
    }
});