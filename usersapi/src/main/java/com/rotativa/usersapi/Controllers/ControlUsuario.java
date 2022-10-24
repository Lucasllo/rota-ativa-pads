package com.rotativa.usersapi.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rotativa.usersapi.Repositories.RepositoryUsuario;
import com.rotativa.usersapi.Entidades.Usuario;
import com.rotativa.usersapi.Services.ServiceUsuario;

@CrossOrigin(origins = "http://localhost:3000") 
@RestController
public class ControlUsuario {
    
    ServiceUsuario servUser;

    public ControlUsuario(ServiceUsuario servUser){
        this.servUser = servUser;
    }    

    @GetMapping("/usuarios")
    public List<Usuario> usuarios(){
        return this.servUser.listar();
    }
/*
    @PostMapping
    public void salvar(@RequestBody Usuario servUser){
        this.servUser.salvar(servUser);
    }

    @DeleteMapping
    public void excluir(@RequestBody Usuario servUser) {
        this.servUser.excluir(servUser);
    }
*/
}