package com.rotativa.usersapi.service;

import java.util.List;

import org.springframework.stereotype.Component;
import com.rotativa.usersapi.entidades.User;

@Component
public interface UserService {
 
    public List<User> listar();
    
    public void salvar(User users);

    public void alterar(User usuario);

    public void excluir(User usuario);
}