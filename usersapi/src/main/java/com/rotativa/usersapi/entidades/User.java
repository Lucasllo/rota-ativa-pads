package com.rotativa.usersapi.entidades;
/* Este projeto utiliza SpringBoot. Para que o Spring reconheça as elementos 
do projeto eles devem ser criados dentro da pasta userapi*/

import javax.persistence.Column; // Definindo regras para a coluna
import javax.persistence.Entity; //O uso de @Entity identifica uma classe como Entidade
import javax.persistence.GeneratedValue; //Gerando valor aleatório
import javax.persistence.GenerationType; //Estabelecendo estratégia para gerar valores aleatórios
import javax.persistence.Id; //identificando chave primária para o framework

@Entity
public class User {
    /*Long = inteiro de 64bytes */
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    @Column(nullable=false)
    private String email;
    private String senha;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
}
