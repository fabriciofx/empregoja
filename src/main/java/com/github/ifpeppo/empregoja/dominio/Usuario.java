package com.github.ifpeppo.empregoja.dominio;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private String email;
    private String senha;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    public String autenticar(){
        
        return "/menu.xhtml";
        
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