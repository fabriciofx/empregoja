package com.github.ifpeppo.empregoja.dominio;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Vaga implements Serializable {

    private static final long serialVersionUID = 1L;

    private String descricao;

    public Vaga(String descricao) {

        this.descricao = descricao;
    }

    public Vaga() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescrisao(String descricao) {
        this.descricao = descricao;
    }

}
