package com.rotativa.usersapi.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rotativa.usersapi.Entidades.Vagas;
import com.rotativa.usersapi.Services.ServiceVagas;

@CrossOrigin(origins = "https://j2kinx-3000.preview.csb.app/") 
  
@RestController
public class ControlVagas {
   private ServiceVagas se2;

    public ControlVagas(ServiceVagas se2){
        this.se2 = se2;
    }

    @GetMapping("/vagas")
    public List<Vagas> VagasTodas(){
        return this.se2.getRepositorio();
    }
  /* 
    @GetMapping("/relatorio")
    List<List<String>> relatorioFinanceiro() {
        List<List<String>> retorno = se2.relatorioFinanceiro();
        return retorno;
    }
   
    @GetMapping("/relatorioPorVaga")
    List<List<String>> relatorioFinanceiroPorVaga(@RequestParam("nome") String nome) {
        List<List<String>> retorno = se2.relatorioFinanceiroPorVaga(nome);
        return retorno;
    }
    */
}