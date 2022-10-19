package com.rotativa.usersapi.Entidades;
/* Este projeto utiliza SpringBoot. Para que o Spring reconheça as elementos 
do projeto eles devem ser criados dentro da pasta userapi*/

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idusuario;
    @Column(name = "cpf", nullable = false)
    private String cpf;
    @Column(name = "nome")
    private String nome;
    @Column(name = "acessibilidade")
    private int acessibilidade;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private String senha;
    @Column(name = "dataNasc")
    private Date datanasc;
    @Column(name = "ticket")
    private int ticket;

    public Usuario() {

    }

    public Usuario(int idusuario, String cpf, String nome, int acessibilidade, String email, String senha,
            Date datanasc, int ticket) {
        this.idusuario = idusuario;
        this.cpf = cpf;
        this.nome = nome;
        this.acessibilidade = acessibilidade;
        this.email = email;
        this.senha = senha;
        this.datanasc = datanasc;
        this.ticket = ticket;
    }

    public int getAcessibilidade() {
        return acessibilidade;
    }

    public void setAcessibilidade(int acessibilidade) {
        this.acessibilidade = acessibilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }

    @Override
    public String toString() {
        return "Usuario {" +
                "id='" + idusuario + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", acessibilidade='" + acessibilidade + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", nascimento='" + datanasc + '\'' +
                ", ticket='" + ticket +
                '}';

    }
}
