package com.rotativa.usersapi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rotativa.usersapi.Repositories.RepositoryVagas;
import com.rotativa.usersapi.Entidades.Vagas;

@Service
public class ServiceVagas{
	
  private RepositoryVagas repositorio;
	
	@Autowired
	public ServiceVagas(RepositoryVagas repositorio) {
		this.repositorio = repositorio;
	}
	
	public List<Vagas> getRepositorio() {
        return this.repositorio.findAll();
    }
    
    public void salvar(Vagas vagas) {
    	repositorio.save(vagas);
    }

    public void alterar(Vagas vagas) {
        if(vagas.getIdvaga()>0){
            repositorio.save(vagas);
        }        
    }

    public void excluir(Vagas usuario) {
        repositorio.delete(usuario);
    }
  
    /* 
    public List<List<String>> relatorioFinanceiro() {
        return repositorio.relatorioFinanceiro();
    }
  
    public List<List<String>> relatorioFinanceiroPorVaga(String nome) {
        return repositorio.relatorioFinanceiroPorVaga(nome);
    }

*/
}