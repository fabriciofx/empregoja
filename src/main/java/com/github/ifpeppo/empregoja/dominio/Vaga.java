package com.github.ifpeppo.empregoja.dominio;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vaga implements Serializable {

    private static final long serialVersionUID = 1L;
   @GeneratedValue
   @Id
    private long id;
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
