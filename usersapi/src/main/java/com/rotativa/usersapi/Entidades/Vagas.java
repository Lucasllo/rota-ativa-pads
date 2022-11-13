package com.rotativa.usersapi.Entidades;

import javax.persistence.Entity; 
import javax.persistence.Column;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Table;

@Entity
@Table(name = "vagas")
public class Vagas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_vaga;
    @Column(name = "rua_avenida")
    private String rua_avenida;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "acessibilidade")
    private int acessibilidade;
    @Column(name = "nomeVaga")
    private String nomeVaga;
  
    public Vagas() {
      //
    }
  
     public Vagas(int idVaga, String rua_avenida, String bairro, int acessibilidade, String nomeVaga) {
        this.id_vaga = idVaga;
        this.rua_avenida = rua_avenida;
        this.bairro = bairro;
        this.acessibilidade = acessibilidade;
        this.nomeVaga = nomeVaga;
    }
    
    
    public String getNomeVaga() {
        return nomeVaga;
    }

    public void setNomeVaga(String nomeVaga) {
        this.nomeVaga = nomeVaga;
    }

    public int getIdvaga() {
        return id_vaga;
    }

    public void setIdvaga(int idVaga) {
        this.id_vaga = idVaga;
    }

    public String getRua_avenida() {
        return rua_avenida;
    }

    public void setRua_avenida(String rua_avenida) {
        this.rua_avenida = rua_avenida;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getAcessibilidade() {
        return acessibilidade;
    }

    public void setAcessibilidade(int acessibilidade) {
        this.acessibilidade = acessibilidade;
    }

    @Override
    public String toString() {
        return "Vagas {" +
                "id='" + id_vaga + '\'' +
                ", logradouro='" + rua_avenida + '\'' +
                ", bairro ='" + bairro + '\'' +
                ", acessibilidade='" + acessibilidade + '\'' +
                ", nomeVaga='" + nomeVaga + '\'' +
                '}';
    }
}

