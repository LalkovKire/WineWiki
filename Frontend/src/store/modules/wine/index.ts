import axios from "@/axios";

const state = {
    wineList: [],
    fetchedWineByID: null
};

const mutations = {
    UPDATE_WINE_LIST(state: any,payload: any) {
        state.wineList = payload;
    },
    UPDATE_FETCHED_WINE(state: any,payload: any) {
        state.fetchedWineByID = payload;
    },
    ADD_WINE(state: any, payload: any) {
        state.wineList.push(payload);
    }
};

const actions = {
    getWineList({ commit }: any) {
        axios.get("/wines/all").then((response) => {
            commit('UPDATE_WINE_LIST', response.data);
        });
    },
    getWineByID({ commit } : any, wineID: number) {
        axios.get(`/wines/${wineID}`).then((response) => {
             commit('UPDATE_FETCHED_WINE', response.data);
        });
    },
    addWine({ commit } : any, wine: object ) {
        axios.post("/wines/add",wine).then((response) => {
            commit('ADD_WINE', response.data);
        })
    }
}; 

const getters = {
    wineList: (state: { wineList: any; }) => state.wineList,
    fetchedWine: (state: {fetchedWineByID: any}) => state.fetchedWineByID
}; 

const wineModule = {
  state, 
  mutations,
  actions,
  getters
};

export default wineModule;