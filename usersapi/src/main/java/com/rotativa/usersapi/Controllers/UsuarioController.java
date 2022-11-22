package com.rotativa.usersapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rotativa.usersapi.Entidades.Usuario;
import com.rotativa.usersapi.Services.UsuarioService;

@CrossOrigin(origins = "http://localhost:3000") 
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired 
    UsuarioService usersService;

    @GetMapping
    public List<Usuario> listar(){
        return this.usersService.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Usuario usuario){
        usersService.save(usuario);
    }

    @PatchMapping
    public void alterar(@RequestBody Usuario usuario){
        usersService.update(usuario);
    }

    // @GetMapping("/filtro")
    // public List<Usuario> filtroUsuario(@RequestParam("nome") String nome) {
    //     System.out.println("Nome = " + nome);
    //     List<Usuario> usuarios = usersService.carregarPorNome(nome);
    //     return usuarios;
    // }

    @GetMapping("/relatorio")
    List<Usuario> relatorioUsuario(@RequestParam("nome") String nome) {
        List<Usuario> filtro = usersService.getUsuario(nome);
        return filtro;
    }



    /* @GetMapping("filtro")
    public List<Usuario> filtroUsuario(String nome) {
        if (nome == null) {
            return usersService.listar();
        } else {
            List<Usuario> usuarios = repositorioUser.carregarPorNome(nome);
            return null;
        }
    } */

}