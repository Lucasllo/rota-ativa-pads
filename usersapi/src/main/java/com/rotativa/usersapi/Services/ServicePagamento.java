package com.rotativa.usersapi.Services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rotativa.usersapi.Repositories.RepositoryPagamento;
import com.rotativa.usersapi.entidades.Pagamento;

@Service
public class ServicePagamento {
	
    private RepositoryPagamento repositorio;
	
    public ServicePagamento(RepositoryPagamento repositorio){
        this.repositorio = repositorio;
    }

    public List<Pagamento> getRepositorio(){
        return this.repositorio.findAll();
    }
	
    public void salvar(Pagamento pag1) {
    	repositorio.save(pag1);
    }

    public void alterar(Pagamento pag1) {
        if(pag1.getIdpagamento()>0){
            repositorio.save(pag1);
        }        
    }

    public void excluir(Pagamento pag1) {
        repositorio.delete(pag1);        
    }
}