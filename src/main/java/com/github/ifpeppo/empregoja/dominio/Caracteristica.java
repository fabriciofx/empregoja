package com.github.ifpeppo.empregoja.dominio;

public class Caracteristica {
    private String texto;
    private TipoCaracteristica tipo;

    public Caracteristica(String texto, TipoCaracteristica tipo) {
        this.texto = texto;
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public TipoCaracteristica getTipo() {
        return tipo;
    }

    public void setTipo(TipoCaracteristica tipo) {
        this.tipo = tipo;
    }
    
}