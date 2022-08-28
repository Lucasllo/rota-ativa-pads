package com.rotativa.usersapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rotativa.usersapi.database.RepositorioUser;
import com.rotativa.usersapi.entidades.User;
import com.rotativa.usersapi.service.UserService;
// possui as operações operações básicas para manipular o usuário no bd
@CrossOrigin(origins = "http://localhost:3000") //Permite que o back envie e receba dados de uma origem diferente
@RestController
@RequestMapping("/user")
public class UserREST {
    @Autowired //o spring cria o objeto, injeta no atributo repositório
	UserService usersService;

    @GetMapping
    public List<User> listar(){
        return usersService.listar();
    }

    @PostMapping
    public void salvar(@RequestBody User usuario){
        usersService.salvar(usuario);
    }

    @PutMapping
    public void alterar(@RequestBody User usuario){
        usersService.alterar(usuario);
    }

    @DeleteMapping
    public void excluir(@RequestBody User usuario){
        usersService.excluir(usuario);
    }

}
