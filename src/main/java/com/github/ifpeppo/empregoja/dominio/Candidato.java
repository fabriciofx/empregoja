package com.github.ifpeppo.empregoja.dominio;

public class Candidato {
    private String nome;
    private String cpf;
    private String celular;
    private String cidade;
    private String uf;
    private Usuario usuario;
    private Caracteristica caracteristica;

    public Candidato(String nome, String cpf, String celular, String cidade, String uf, Usuario usuario, Caracteristica caracteristica) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.cidade = cidade;
        this.uf = uf;
        this.usuario = usuario;
        this.caracteristica = caracteristica;
    }
    
    // Apenas pro CDI/JPA
    public Candidato() {
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(Caracteristica caracteristica) {
        this.caracteristica = caracteristica;
    }

}