package com.rotativa.usersapi.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "telefone",schema = "rotaativa")
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtelefone;
      
    private String telefone;
    
    @ManyToOne
    @JoinColumn(nullable = false,unique = false)//se for OneToOne o unique tem que ser true
    private Usuario usuario;
  

    
    public int getIdtelefone() {
        return idtelefone;
    }
    public void setIdtelefone(int idtelefone) {
        this.idtelefone = idtelefone;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
