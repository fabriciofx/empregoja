package com.github.ifpeppo.empregoja.dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidato")
public class Candidato implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String nome;
    private String cpf;
    private String celular;
    @Embedded
    private Endereco endereco;
    @Embedded
    private Usuario usuario;
    private List<Caracteristica> caracteristicas;

    public Candidato(String nome, String cpf, String celular, Endereco endereco, Usuario usuario, List<Caracteristica> caracteristicas) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.endereco = endereco;
        this.usuario = usuario;
        this.caracteristicas = caracteristicas;
    }

    // Apenas pro CDI/JPA
    public Candidato() {
    }

    public long getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Caracteristica> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristica(List<Caracteristica> caracteristica) {
        this.caracteristicas = caracteristica;
    }

}
