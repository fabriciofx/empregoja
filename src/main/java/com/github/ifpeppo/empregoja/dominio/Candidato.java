package com.github.ifpeppo.empregoja.dominio;

public class Candidato {
    private String nome;
    private String cpf;
    private String celular;
    private String cidade;
    private String uf;
    private Usuario usuario;
    private Experiencia experiencia;
    private Comportamento comportamento;

    public Candidato(String nome, String cpf, String celular, String cidade, String uf, Usuario usuario, Experiencia experiencia, Comportamento comportamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.cidade = cidade;
        this.uf = uf;
        this.usuario = usuario;
        this.experiencia = experiencia;
        this.comportamento = comportamento;
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

    public Experiencia getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Experiencia experiencia) {
        this.experiencia = experiencia;
    }

    public Comportamento getComportamento() {
        return comportamento;
    }

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    
}