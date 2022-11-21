package com.rotativa.usersapi.Entidades;
import javax.persistence.Column;
/* Este projeto utiliza SpringBoot. Para que o Spring reconheça as elementos 
do projeto eles devem ser criados dentro da pasta userapi*/
import javax.persistence.Entity; //O uso de @Entity identifica uma classe como Entidade
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; //identificando chave primária para o framework
import javax.persistence.Table;

@Entity
@Table(name = "veiculo",schema = "rotaativa")
public class VeiculoModel {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_veiculo")
  private int idVeiculo;
  @Column(name = "cor")
  private String cor;
  @Column(name = "placa")
  private String placa;
  @Column(name = "modelo")
  private String modelo;
  @ManyToMany
  @JoinTable(name = "usuario_has_veiculo", joinColumns = {@JoinColumn(name = "veiculo_id_veiculo")}, inverseJoinColumns = {@JoinColumn(name = "usuario_id_usuario")})
  private Set<UsuarioModel> usuarios;

  public int getIdVeiculo() {
    return idVeiculo;
  }

  public void setIdVeiculo(int idVeiculo) {
    this.idVeiculo = idVeiculo;
  }

  public Set<UsuarioModel> getUsuarios() {
    return usuarios;
  }

  public void setUsuarios(Set<UsuarioModel> usuarios) {
    this.usuarios = usuarios;
  }

  public int getIdveiculo() {
    return idVeiculo;
  }

  public void setIdveiculo(int idveiculo) {
    this.idVeiculo = idveiculo;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

}
