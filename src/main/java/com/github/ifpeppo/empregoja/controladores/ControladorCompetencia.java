/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.controladores;

import com.github.ifpeppo.empregoja.dominio.Competencia;
import com.github.ifpeppo.empregoja.dominio.repositorio.Competencias;
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
public class ControladorCompetencia implements Serializable {
    private static final long serialVersionUID = 1;
    
    @Inject
    private Competencias competencias;
    
    private Competencia competencia;
    private List<Competencia> todasCompetencias;
    
    public void consultar(){
        todasCompetencias = competencias.todos();
    }
    
    public void novo(){
        competencia = new Competencia();
    }
    
    public String adicionar(){
        competencias.adiciona(competencia);
        consultar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Candidato cadastrado com sucesso!"));
        return "";
    }
    
    public void alterar(){
        competencias.alterar(competencia);
    }
    
    public Competencia getCompetencia(){
        return competencia;
    }
    
    public List<Competencia> getTodasCompetencias(){
        return todasCompetencias;
    }
    
    public void detalhe(Competencia competencia){
        this.competencia = competencia;
    }
}