package com.rotativa.usersapi.service;
// interface criada em arquivo separado para manter a privacidade da implementação dos métodos.
import java.util.List;

import org.springframework.stereotype.Component;
import com.rotativa.usersapi.entidades.*;

@Component
public interface PagamentoService {
 
    public List<Pagamento> listar();
    
    public void salvar(Pagamento pagamento);

    public void alterar(Pagamento pagamento);

    public void excluir(Pagamento pagamento);
}