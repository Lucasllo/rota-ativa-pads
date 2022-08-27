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
// possui as operações operações básicas para manipular o usuário no bd
@CrossOrigin(origins = "http://localhost:3000") //Permite que o back envie e receba dados de uma origem diferente
@RestController
@RequestMapping("/user")
public class UserREST {
    @Autowired //o spring cria o objeto, injeta no atributo repositório
    private RepositorioUser repositorio;

    @GetMapping
    public List<User> listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody User usuario){
        repositorio.save(usuario);
    }

    @PutMapping
    public void alterar(@RequestBody User usuario){
        if(usuario.getId()>0){
            repositorio.save(usuario);
        }
    }

    @DeleteMapping
    public void excluir(@RequestBody User usuario){
        repositorio.delete(usuario);
    }

}
