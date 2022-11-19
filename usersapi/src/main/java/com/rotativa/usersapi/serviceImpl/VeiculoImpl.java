package com.rotativa.usersapi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rotativa.usersapi.service.*;

import com.rotativa.usersapi.database.*;
import com.rotativa.usersapi.entidades.*;

@Service("veiculoService")
public class VeiculoImpl implements VeiculoService{
	
    RepositorioVeiculo repositorioVeiculo;
	
	@Autowired
	public VeiculoImpl(RepositorioVeiculo repositorioVeiculo) {
		this.repositorioVeiculo = repositorioVeiculo;
	}
	
	@Override
	public List<Veiculo> listar() {
        return repositorioVeiculo.findAll();
    }
    
	@Override
    public void salvar(Veiculo veiculo) {
    	repositorioVeiculo.save(veiculo);
    }

    @Override
    public void alterar(Veiculo veiculo) {
        if(veiculo.getIdveiculo()>0){
            repositorioVeiculo.save(veiculo);
        }        
    }

    @Override
    public void excluir(Veiculo veiculo) {
        repositorioVeiculo.delete(veiculo);        
    }
}

