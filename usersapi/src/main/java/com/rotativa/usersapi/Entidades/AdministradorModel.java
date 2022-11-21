package com.rotativa.usersapi.Entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administrador")
public class AdministradorModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_administrador")
    private int idAdministrador;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "email")
    private String email;
    @Column(name = "data_nasc")
    private Date dataNasc;
    @Column(name = "senha")
    private int senha;

    public int  getIdadministrador() {
        return idAdministrador;
    }
    public void setIdadministrador(int idadministrador) {
        this.idAdministrador = idadministrador;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDatanasc() {
        return dataNasc;
    }
    public void setDatanasc(Date datanasc) {
        this.dataNasc = datanasc;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Administrador {" +
                "id='"+idAdministrador+'\'' +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", datanasc='" + dataNasc + '\'' +
                ", senha='" + senha + 
                '}';

    }
    
}
