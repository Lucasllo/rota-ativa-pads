import API from './api';

export default class VagaService{

    getVaga(){
        return API.get("/vaga");
    }

}