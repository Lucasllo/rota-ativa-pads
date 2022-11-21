package com.rotativa.usersapi.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "telefone",schema = "rotaativa")
public class TelefoneModel {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_telefone")
    private int idTelefone;
    @Column(name = "telefone")
    private String telefone;
    @ManyToOne
    @JoinColumn(name="usuario_id_usuario")
    private UsuarioModel usuario;
   
    
    public int getIdTelefone() {
        return idTelefone;
    }
    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
    }
    
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
     
    public int getIdtelefone() {
        return idTelefone;
    }
    public void setIdtelefone(int idtelefone) {
        this.idTelefone = idtelefone;
    }
    
    public UsuarioModel getUsuario() {
        return usuario;
    }
    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }
     
    
}
