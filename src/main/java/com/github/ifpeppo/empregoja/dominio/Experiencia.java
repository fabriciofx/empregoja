package com.github.ifpeppo.empregoja.dominio;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Experiencia implements Serializable {

    private static final long serialVersionUID = 1L;

    private String texto;

    public Experiencia(String texto) {
        this.texto = texto;
    }

    public Experiencia() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
