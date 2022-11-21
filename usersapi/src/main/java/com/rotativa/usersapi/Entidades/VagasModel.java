package com.rotativa.usersapi.Entidades;
/* Este projeto utiliza SpringBoot. Para que o Spring reconheça as elementos 
do projeto eles devem ser criados dentro da pasta userapi*/
import java.sql.Time;

import javax.persistence.Entity; //O uso de @Entity identifica uma classe como Entidade
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column; // Definindo regras para a coluna
import javax.persistence.Id; //identificando chave primária para o framework
import javax.persistence.Table;

@Entity
@Table(name = "vaga",schema = "rotaativa")
public class VagasModel {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_vaga")
    private Long idVaga;
    @Column(name = "rua_avenida")
    private String ruaAvenida;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "acessibilidade")
    private String acessibilidade;
    @Column(name = "nome_vaga")
    private String nomeVaga;
    @Column(name = "longitude_inicial")
    private int longitudeInicial;
    @Column(name = "longitude_final")
    private int longitudeFinal;
    @Column(name = "latitude_inicial")
    private int latitudeInicial;
    @Column(name = "latitude_final")
    private int latitudeFinal;
    @Column(name = "horario_uso_inicial")
    private Time horarioUsoInicial;
    @Column(name = "horario_uso_Final")
    private Time horarioUsoFinal;
    @Column(name = "estado_vaga")
    private boolean estadoVaga;
    @Column(name = "tempo_ticket")
    private int tempoTicket;
        
    public VagasModel(Long idVaga) {
        super();
        this.idVaga = idVaga;        
    }
    
    public Long getIdvaga() {
        return idVaga;
    }
    public int getTempoticket() {
        return tempoTicket;
    }
    public void setTempoticket(int tempoticket) {
        this.tempoTicket = tempoticket;
    }
    public void setIdvaga(Long idvaga) {
        this.idVaga = idvaga;
    }
    public String getRua_avenida() {
        return ruaAvenida;
    }
    public void setRua_avenida(String rua_avenida) {
        this.ruaAvenida = rua_avenida;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getAcessibilidade() {
        return acessibilidade;
    }
    public void setAcessibilidade(String acessibilidade) {
        this.acessibilidade = acessibilidade;
    }
    public String getNomeVaga() {
        return nomeVaga;
    }
    public void setNomeVaga(String nomeVaga) {
        this.nomeVaga = nomeVaga;
    }
    public int getLongitudeInicial() {
        return longitudeInicial;
    }
    public void setLongitudeInicial(int longitudeInicial) {
        this.longitudeInicial = longitudeInicial;
    }
    public int getLongitudeFinal() {
        return longitudeFinal;
    }
    public void setLongitudeFinal(int longitudeFinal) {
        this.longitudeFinal = longitudeFinal;
    }
    public int getLatitudeInicial() {
        return latitudeInicial;
    }
    public void setLatitudeInicial(int latitudeInicial) {
        this.latitudeInicial = latitudeInicial;
    }
    public int getLatitudeFinal() {
        return latitudeFinal;
    }
    public void setLatitudeFinal(int latitudeFinal) {
        this.latitudeFinal = latitudeFinal;
    }
    public Time getHorarioUsoInica() {
        return horarioUsoInicial;
    }
    public void setHorarioUsoInica(Time horarioUsoInica) {
        this.horarioUsoInicial = horarioUsoInica;
    }
    public Time getHorarioUsoFinal() {
        return horarioUsoFinal;
    }
    public void setHorarioUsoFinal(Time horarioUsoFinal) {
        this.horarioUsoFinal = horarioUsoFinal;
    }
    public boolean isEstadoVaga() {
        return estadoVaga;
    }
    public void setEstadoVaga(boolean estadoVaga) {
        this.estadoVaga = estadoVaga;
    }
}
