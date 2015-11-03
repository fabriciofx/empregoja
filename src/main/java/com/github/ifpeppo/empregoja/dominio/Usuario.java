/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.dominio;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author everton
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private long id;
    
    @Embedded
    private String email;
    @Embedded
    private String senha;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    public Usuario(){
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
