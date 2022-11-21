package com.rotativa.usersapi.Entidades;

import java.util.Date;
import javax.persistence.Entity; 
import javax.persistence.Column;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Table;

@Entity
@Table(name = "transacao",schema = "rotaativa")
public class TransacaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_transacao;
    @ManyToOne
    @JoinColumn(name = "vaga_id_vaga")
    private VagasModel vaga_idvaga;
    @ManyToOne
    @JoinColumn(name = "usuario_id_usuario")
    private UsuarioModel usuario_idusuario;
    @Column(name = "entrada")
    private Date entrada;
    @Column(name = "saida")
    private Date saida;
    @Column(name = "ticketsUsados")
    private int ticketsUsados;

    
    public int getTicketsUsados() {
        return ticketsUsados;
    }

    public void setTicketsUsados(int ticketsUsados) {
        this.ticketsUsados = ticketsUsados;
    }

    public int getId_transacao() {
        return id_transacao;
    }

    public void setId_Transacao(int id_transacao) {
        this.id_transacao = id_transacao;
    }

    public VagasModel getVaga_idvaga() {
        return vaga_idvaga;
    }

    public void setVaga_idvaga(VagasModel vaga_idvaga) {
        this.vaga_idvaga = vaga_idvaga;
    }

    public UsuarioModel getUsuario_idusuario() {
        return usuario_idusuario;
    }

    public void setUsuario_idusuario(UsuarioModel usuario_idusuario) {
        this.usuario_idusuario = usuario_idusuario;
    }

  public Date getSaida() {
        return saida;
    }

    public void setSaida (Date saida) {
        this.saida = saida;
    }


    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada (Date entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "Vagas {" +
                "id='" + id_transacao + '\'' +
                ", vaga='" + vaga_idvaga + '\'' +
                ", usuario ='" + usuario_idusuario + '\'' +
                ", entrada='" + entrada + '\'' +
                ", saida='" + saida + '\'' +
                ", ticketsUsados='" + ticketsUsados + '\'' +
                '}';
    }
}