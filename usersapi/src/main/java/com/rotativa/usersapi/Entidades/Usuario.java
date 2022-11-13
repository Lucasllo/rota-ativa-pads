package com.rotativa.usersapi.Entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_usuario;
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
    @Column(name = "ticket")
    private int ticket;
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	/*@JoinTable(name="usuario_has_veiculo",
             joinColumns={@JoinColumn(name = "id_usuario")},
             inverseJoinColumns={@JoinColumn(name = "id_veiculo")}) */
	private List<Veiculo> veiculos;

  public Usuario() {
    //
 	}
  
     public Usuario(int id_usuario, String cpf, String nome, int acessibilidade, String email, String senha, int ticket) {
 		this.id_usuario = id_usuario;
 		this.cpf = cpf;
 		this.nome = nome;
 		this.acessibilidade = acessibilidade;
 		this.email = email;
 		this.senha = senha;
 		this.ticket = ticket;
 	}

  public int getIdUsuario() {
		return id_usuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.id_usuario = idUsuario;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAcessibilidade() {
		return acessibilidade;
	}


	public void setAcessibilidade(int acessibilidade) {
		this.acessibilidade = acessibilidade;
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


	public int getTicket() {
		return ticket;
	}


	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

   @Override
    public String toString() {
        return "Usuario {" +
                "id='" + id_usuario + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", acessibilidade='" + acessibilidade + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", ticket='" + ticket +
                '}';

    }
}
