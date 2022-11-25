import API from './api';

export default class UserService{

    getUser(){
        return API.get("/user");
    }

    getUsuario(){
        return API.get("/usuario");
    }

    getRelatorioUsuarioVaga(vaga){
        return API.get(`/usuario/relatorioVaga/?nome=${vaga}`);
    }

    putUsuario(id, usuario){
        return API.put(`/usuario`, usuario);
    }

}