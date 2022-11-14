package com.rotativa.usersapi.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rotativa.usersapi.Entidades.Usuario;
import com.rotativa.usersapi.Services.ServiceUsuario;

@CrossOrigin(origins = "https://j2kinx-3000.preview.csb.app/") 

@RestController
public class ControlUsuario {
    private ServiceUsuario se1;

    public ControlUsuario(ServiceUsuario se1){
        this.se1 = se1;
    }
  
    @GetMapping("/usuarios")
    public List<Usuario> usuariosTodos(){
        return this.se1.getRepositorio();
    }

    @PostMapping("/usuarios/usuario:")
    public void salvar(@RequestBody Usuario usuario){
        se1.salvar(usuario);
    }

    @DeleteMapping
    public void excluir(@RequestBody Usuario usuario) {
        se1.excluir(usuario);
    }

}