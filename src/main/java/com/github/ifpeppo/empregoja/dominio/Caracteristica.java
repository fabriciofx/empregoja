package com.github.ifpeppo.empregoja.dominio;

public class Caracteristica {
    private String texto;
    private TipoCaracteristicas tipoCaracteristica;

    public Caracteristica(String texto, TipoCaracteristicas tipoCaracteristica) {
        this.texto = texto;
        this.tipoCaracteristica = tipoCaracteristica;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public TipoCaracteristicas getTipoCaracteristica() {
        return tipoCaracteristica;
    }

    public void setTipoCaracteristica(TipoCaracteristicas tipoCaracteristica) {
        this.tipoCaracteristica = tipoCaracteristica;
    }
    
}