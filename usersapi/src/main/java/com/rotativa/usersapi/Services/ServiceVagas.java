package com.rotativa.usersapi.Services;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rotativa.usersapi.Repositories.RepositoryVagas;
import com.rotativa.usersapi.Entidades.Vagas;

@Service
public class ServiceVagas{
	
    RepositoryVagas repositorioVaga;
	
	@Autowired
	public ServiceVagas(RepositoryVagas repositorioVaga) {
		this.repositorioVaga = repositorioVaga;
	}
	
	public List<Vagas> listar() {
        return repositorioVaga.findAll();
    }
    
    public void salvar(Vagas vagas) {
    	repositorioVaga.save(vagas);
    }

    public void alterar(Vagas vagas) {
        if(vagas.getIdvaga()>0){
            repositorioVaga.save(vagas);
        }        
    }

    public void excluir(Vagas usuario) {
        repositorioVaga.delete(usuario);
    }
  
    public List<List<String>> relatorioFinanceiro() {
        return repositorioVaga.relatorioFinanceiro();
    }
  
    public List<List<String>> relatorioFinanceiroPorVaga(String nome) {
        return repositorioVaga.relatorioFinanceiroPorVaga(nome);
    }


}