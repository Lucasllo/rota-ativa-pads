package com.rotativa.usersapi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rotativa.usersapi.Repositories.RepositoryUsuario;
import com.rotativa.usersapi.Entidades.Usuario;

@Service
public class ServiceUsuario{
	
	private RepositoryUsuario repositorio;
	
	@Autowired
	public ServiceUsuario(RepositoryUsuario repositorio) {
		this.repositorio = repositorio;
	}
	
	public List<Usuario> listar() {
        return this.repositorio.findAll();
    }
    /*
    public void salvar(Usuario users) {
    	repositorio.save(users);
    }

    public void excluir(Usuario usuario) {
        repositorio.delete(usuario);        
    }
*/
}