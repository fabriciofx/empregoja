/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.controladores;

import com.github.ifpeppo.empregoja.dominio.Experiencia;
import com.github.ifpeppo.empregoja.dominio.repositorio.Experiencias;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author everton
 */
@Named
@ViewScoped
public class ControladorExperiencia implements Serializable {
    private static final long serialVersionUID = 1;
    
    @Inject
    private Experiencias experiencias;
    
    private Experiencia experiencia;
    private List<Experiencia> todasExperiencias;
    
    public void consultar(){
        todasExperiencias = experiencias.todos();
    }
    
    public void novo(){
        experiencia = new Experiencia();
    }
    
    public String adicionar(){
        experiencias.adiciona(experiencia);
        consultar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Candidato cadastrado com sucesso!"));
        return "";
    }
    
    public void alterar(){
        experiencias.alterar(experiencia);
    }
    
    public Experiencia getExperiencia(){
        return experiencia;
    }
    
    public List<Experiencia> getTodasExperiencias(){
        return todasExperiencias;
    }
    
    public void detalhe(Experiencia experiencia){
        this.experiencia = experiencia;
    }
}