package com.rotativa.usersapi.service;
// interface criada em arquivo separado para manter a privacidade da implementação dos métodos.
import java.util.List;

import org.springframework.stereotype.Component;
import com.rotativa.usersapi.Entidades.*;

@Component
public interface TelefoneService {
 
    public List<Telefone> listar();
    
    public void salvar(Telefone telefone);

    public void alterar(Telefone telefone);

    public void excluir(Telefone telefone);
}