package com.github.ifpeppo.empregoja.dominio;

public class Empresa {
    private String nome;
    private String cnpj;
    private Usuario usuario;

    public Empresa(String nome, String cnpj, Usuario usuario) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}