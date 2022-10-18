package com.rotativa.usersapi.service;
// interface criada em arquivo separado para manter a privacidade da implementação dos métodos.
import java.util.List;

import org.springframework.stereotype.Component;
import com.rotativa.usersapi.Entidades.Vagas;

@Component
public interface VagaService {
 
    public List<Vagas> listar();
    
    public void salvar(Vagas vagas);

    public void alterar(Vagas vagas);

    public void excluir(Vagas vagas);
}