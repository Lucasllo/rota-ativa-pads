package com.rotativa.usersapi.Controllers;

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
import com.rotativa.usersapi.Entidades.*;
import com.rotativa.usersapi.Services.TelefoneService;
// possui as operações operações básicas para manipular o usuário no bd
@CrossOrigin(origins = "http://localhost:3000") //Permite que o back envie e receba dados de uma origem diferente
@RestController
@RequestMapping("/telefone")
public class TelefoneController {
    @Autowired //o spring cria o objeto, injeta no atributo repositório
	TelefoneService telefoneService;

    @GetMapping
    public List<TelefoneModel> listar(){
        return telefoneService.listar();
    }

    @PostMapping
    public void salvar(@RequestBody TelefoneModel telefone){
        telefoneService.salvar(telefone);
    }

    @PutMapping
    public void alterar(@RequestBody TelefoneModel telefone){
        telefoneService.alterar(telefone);
    }

    @DeleteMapping
    public void excluir(@RequestBody TelefoneModel telefone){
        telefoneService.excluir(telefone);
    }

}