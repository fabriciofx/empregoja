/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.controladores;

import com.github.ifpeppo.empregoja.dominio.Usuario;
import com.github.ifpeppo.empregoja.dominio.repositorio.Usuarios;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author leonardoanselmo
 */
@Named
@ViewScoped
public class ControladorUsuario implements Serializable {
    
    private static final long serialVersionUID = 1;
    
    @Inject
    private Usuarios usuarios;
    
    private Usuario usuario;
    private List<Usuario> todosUsuarios;
    
    public void consultar(){
        todosUsuarios = usuarios.todos();
    }
    
    public void novo(){
        usuario = new Usuario();
    }
    
    public String adicionar(){
        usuarios.adiciona(usuario);
        consultar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario cadastrado com sucesso!"));
        
        return "";
    }
    
    public void alterar(){
        usuarios.alterar(usuario);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Usuario> getTodosUsuarios() {
        return todosUsuarios;
    }
    
    public void detalhe(Usuario usuario){
        this.usuario = usuario;
    }
    
    
}
