package com.rotativa.usersapi.Entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * A Vaga.
 */
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
    private Integer longitudeInicial;

    @Column(name = "longitude_final")
    private Integer longitudeFinal;

    @Column(name = "latitude_inicial")
    private Integer latitudeInicial;

    @Column(name = "latitude_final")
    private Integer latitudeFinal;

    // jhipster-needle-entity-add-field - JHipster will add fields here

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

    public Integer getLongitudeInicial() {
        return this.longitudeInicial;
    }

    public Vaga longitudeInicial(Integer longitudeInicial) {
        this.setLongitudeInicial(longitudeInicial);
        return this;
    }

    public void setLongitudeInicial(Integer longitudeInicial) {
        this.longitudeInicial = longitudeInicial;
    }

    public Integer getLongitudeFinal() {
        return this.longitudeFinal;
    }

    public Vaga longitudeFinal(Integer longitudeFinal) {
        this.setLongitudeFinal(longitudeFinal);
        return this;
    }

    public void setLongitudeFinal(Integer longitudeFinal) {
        this.longitudeFinal = longitudeFinal;
    }

    public Integer getLatitudeInicial() {
        return this.latitudeInicial;
    }

    public Vaga latitudeInicial(Integer latitudeInicial) {
        this.setLatitudeInicial(latitudeInicial);
        return this;
    }

    public void setLatitudeInicial(Integer latitudeInicial) {
        this.latitudeInicial = latitudeInicial;
    }

    public Integer getLatitudeFinal() {
        return this.latitudeFinal;
    }

    public Vaga latitudeFinal(Integer latitudeFinal) {
        this.setLatitudeFinal(latitudeFinal);
        return this;
    }

    public void setLatitudeFinal(Integer latitudeFinal) {
        this.latitudeFinal = latitudeFinal;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

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
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
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
