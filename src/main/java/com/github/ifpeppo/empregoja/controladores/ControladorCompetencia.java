/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.controladores;

import com.github.ifpeppo.empregoja.dominio.Competencia;
import com.github.ifpeppo.empregoja.dominio.repositorio.Competencias;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
    private List<Competencia> competenciasSelecionadas;
    
    public void consultar(){
        todasCompetencias = competencias.todos();
    }
    
    public void novo(){
        competencia = new Competencia();
    }
    
    public void adicionarCompetenciasCandidato(){
        if(this.competenciasSelecionadas == null){
            this.competenciasSelecionadas = new ArrayList<>();
        }
        adicionar();
        this.competenciasSelecionadas.add(competencia);
    }
    
    public void adicionar(){
        competencias.adiciona(competencia);
        consultar();
    }
    
    public void alterar(){
        competencias.alterar(competencia);
    }
    
    public Competencia getCompetencia(){
        return competencia;
    }
    
    public List<Competencia> getTodasCompetencias(){
        consultar();
        return todasCompetencias;
    }
    
    public void setCompetencia(Competencia competencia){
        this.competencia = competencia;
    }

    public List<Competencia> getCompetenciasSelecionadas() {
        return this.competenciasSelecionadas;
    }

    public void setCompetenciasSelecionadas(List<Competencia> competenciasSelecionadas) {
        this.competenciasSelecionadas = competenciasSelecionadas;
    }  
}