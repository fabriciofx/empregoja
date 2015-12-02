package com.github.ifpeppo.empregoja.dominio;

import java.io.Serializable;
<<<<<<< HEAD
import javax.persistence.Embeddable;
=======
>>>>>>> 52179e4f10a8ccf2f0f1c7338c0899901ee80dbc
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vaga implements Serializable {
    private static final long serialVersionUID = 1L;
<<<<<<< HEAD
   @GeneratedValue
   @Id
    private long id;
=======
    
    @Id
    @GeneratedValue
    private long id;
    
>>>>>>> 52179e4f10a8ccf2f0f1c7338c0899901ee80dbc
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
