package com.rotativa.usersapi.Entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "vaga")
public class Vaga implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "acessibilidade")
    private Boolean acessibilidade;

    @Column(name = "nome")
    private String nome;

    @Column(name = "longitude_inicial")
    private Double longitudeInicial;

    @Column(name = "longitude_final")
    private Double longitudeFinal;

    @Column(name = "latitude_inicial")
    private Double latitudeInicial;

    @Column(name = "latitude_final")
    private Double latitudeFinal;

    @Column(name = "horario_uso_inicial")
    private Date horarioUsoInicial;

    @Column(name = "horario_uso_final")
    private Date horarioUsoFinal;

     public Vaga(
            Long id,
            String nome,
            String logradouro,
            String bairro,
            Boolean acessibilidade,
            Double longitudeInicial,
            Double longitudeFinal,
            Double latitudeInicial,
            Double latitudeFinal) {

        this.id = id;
        this.nome = nome;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.acessibilidade = acessibilidade;
        this.longitudeInicial = longitudeInicial;
        this.longitudeFinal = longitudeFinal;
        this.latitudeInicial = latitudeInicial;
        this.latitudeFinal = latitudeFinal;
    }

    public Vaga() {
    }

    public Long getId() {
        return this.id;
    }

    public Vaga id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public Vaga logradouro(String logradouro) {
        this.setLogradouro(logradouro);
        return this;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return this.bairro;
    }

    public Vaga bairro(String bairro) {
        this.setBairro(bairro);
        return this;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Boolean getAcessibilidade() {
        return this.acessibilidade;
    }

    public Vaga acessibilidade(Boolean acessibilidade) {
        this.setAcessibilidade(acessibilidade);
        return this;
    }

    public void setAcessibilidade(Boolean acessibilidade) {
        this.acessibilidade = acessibilidade;
    }

    public String getNome() {
        return this.nome;
    }

    public Vaga nome(String nome) {
        this.setNome(nome);
        return this;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getLongitudeInicial() {
        return this.longitudeInicial;
    }

    public Vaga longitudeInicial(Double longitudeInicial) {
        this.setLongitudeInicial(longitudeInicial);
        return this;
    }

    public void setLongitudeInicial(Double longitudeInicial) {
        this.longitudeInicial = longitudeInicial;
    }

    public Double getLongitudeFinal() {
        return this.longitudeFinal;
    }

    public Vaga longitudeFinal(Double longitudeFinal) {
        this.setLongitudeFinal(longitudeFinal);
        return this;
    }

    public void setLongitudeFinal(Double longitudeFinal) {
        this.longitudeFinal = longitudeFinal;
    }

    public Double getLatitudeInicial() {
        return this.latitudeInicial;
    }

    public Vaga latitudeInicial(Double latitudeInicial) {
        this.setLatitudeInicial(latitudeInicial);
        return this;
    }

    public void setLatitudeInicial(Double latitudeInicial) {
        this.latitudeInicial = latitudeInicial;
    }

    public Double getLatitudeFinal() {
        return this.latitudeFinal;
    }

    public Vaga latitudeFinal(Double latitudeFinal) {
        this.setLatitudeFinal(latitudeFinal);
        return this;
    }

    public void setLatitudeFinal(Double latitudeFinal) {
        this.latitudeFinal = latitudeFinal;
    }

    public Date getHorarioUsoInicial() {
        return horarioUsoInicial;
    }

    public void setHorarioUsoInicial(Date horarioUsoInicial) {
        this.horarioUsoInicial = horarioUsoInicial;
    }

    public Date getHorarioUsoFinal() {
        return horarioUsoFinal;
    }

    public void setHorarioUsoFinal(Date horarioUsoFinal) {
        this.horarioUsoFinal = horarioUsoFinal;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and
    // setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Vaga)) {
            return false;
        }
        return id != null && id.equals(((Vaga) o).id);
    }

    @Override
    public int hashCode() {
        // see
        // https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "id=" + getId() +
                ", logradouro='" + getLogradouro() + "'" +
                ", bairro='" + getBairro() + "'" +
                ", acessibilidade='" + getAcessibilidade() + "'" +
                ", nome='" + getNome() + "'" +
                ", longitudeInicial=" + getLongitudeInicial() +
                ", longitudeFinal=" + getLongitudeFinal() +
                ", latitudeInicial=" + getLatitudeInicial() +
                ", latitudeFinal=" + getLatitudeFinal() +
                "}";
    }
}
