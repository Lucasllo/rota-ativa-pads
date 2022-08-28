import API from './api';

export default class UserService{

    getUser(){
        return API.get("/user");
    }

}