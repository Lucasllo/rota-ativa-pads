package com.rotativa.usersapi.Entidades;

import java.util.Date;
import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.Table;


@Entity
@Table(name="usuario",schema = "rotaativa")
public class UsuarioModel {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUsuario;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "nome")
    private String nome;
    @Column(name = "acessibilidade")
    private int acessibilidade;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private String senha;
    @Column(name = "data_nasc")
    private Date dataNasc;
    @Column(name = "ticket")
    private int ticket;
    @ManyToMany
    @JoinTable(name = "usuario_has_veiculo", joinColumns = {@JoinColumn(name = "usuario_id_usuario")}, inverseJoinColumns = {@JoinColumn(name = "veiculo_id_veiculo")})
    private Set<VeiculoModel> veiculos;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Set<VeiculoModel> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Set<VeiculoModel> veiculos) {
        this.veiculos = veiculos;
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
        return idUsuario;
    }

    public void setIdusuario(int idusuario) {
        this.idUsuario = idusuario;
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
        return dataNasc;
    }

    public void setDatanasc(Date datanasc) {
        this.dataNasc = datanasc;
    }

    @Override
    public String toString() {
        return "Usuario {" +
                "id='" + idUsuario + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", acessibilidade='" + acessibilidade + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", ticket='" + ticket +
                '}';
    }

}
