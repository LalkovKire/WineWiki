import axios from "@/axios";

const state = {
    manufacturersList: [],
    lastestAddedManufacturer: null
};

const mutations = {
    UPDATE_MANU_LIST(state: any,payload: any) {
        state.manufacturersList = payload;
    },
    ADD_TO_LIST(state: any, payload: any) {
        const existingManufacturer = state.manufacturersList.find((manufacturer: { id: number; }) => manufacturer.id === payload.id);
        if (!existingManufacturer) {
            state.manufacturersList.push(payload);
        }
        state.lastestAddedManufacturer = payload;
    }
};

const actions = {
    getManufacturersList({ commit }: any) {
        axios.get("/manufacturer/all").then((response) => {
            commit('UPDATE_MANU_LIST', response.data);
        });
    },
    addManufacturer({ commit }: any, manufac: object) {
        axios.post("/manufacturer/add",manufac).then((response) => {
            commit('ADD_TO_LIST', response.data)
        });
    }
}; 

const getters = {
    manufacturerList: (state: { manufacturersList: any; }) => state.manufacturersList,
    latestManufacturer: (state: { lastestAddedManufacturer: any; }) => state.lastestAddedManufacturer
}; 

const manufacturersModule = {
  state, 
  mutations,
  actions,
  getters
};

export default manufacturersModule;