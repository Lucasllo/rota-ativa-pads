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

import com.rotativa.usersapi.database.RepositorioUser;
import com.rotativa.usersapi.entidades.Usuario;
import com.rotativa.usersapi.service.UserService;

@CrossOrigin(origins = "http://localhost:3000") 
@RestController
public class ControlUsuario {
    
    ServiceUsuario se1;

    public ControlUsuario(ServiceUsuario se1){
        this.se1 = se1;
    }    

    @GetMapping("/usuarios")
    public List<Usuario> listar(){
        return this.se1.getRepositorio();
    }

    @PostMapping
    public void salvar(@RequestBody Usuario us1){
        this.se1.salvar(us1);
    }

    @PutMapping
    public void alterar(@RequestBody Usuario us1){
        this.se1.alterar(us1);
    }

    @DeleteMapping
    public void excluir(@RequestBody Usuario us1) {
        this.se1.excluir(us1);
    }

    @GetMapping("/filtro")
    public List<Usuario> filtroUsuario(@RequestParam("nome") String nome) {
        System.out.println("Nome =" + nome);
        List<Usuario> usuarios = this.se1.carregarPorNome(nome);
        return usuarios ;
    }


    /* @GetMapping("filtro")
    public List<Usuario> filtroUsuario(String nome) {
        if (nome == null) {
            return this.se1.listar();
        } else {
            List<Usuario> usuarios = repositorioUser.carregarPorNome(nome);
            return null;
        }
    } */

}