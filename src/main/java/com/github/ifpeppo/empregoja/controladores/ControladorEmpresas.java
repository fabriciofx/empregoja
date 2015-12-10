/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.controladores;

import com.github.ifpeppo.empregoja.dominio.Empresa;
import com.github.ifpeppo.empregoja.dominio.Vaga;
import com.github.ifpeppo.empregoja.dominio.repositorio.Empresas;

import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Jackson Carvalho
 */
@Named
@ViewScoped
public class ControladorEmpresas implements Serializable {

    private static final long serialVersionUID = 1;

    @Inject
    private Empresas empresas;


    private  Empresa  empresa;
    private List< Empresa> todasEmpresas;
    private String vagaEmpresa= null;
    
    public void consultar() {
        todasEmpresas =  empresas.todos();
    }

    public void novo() {
         empresa = new Empresa();
    }

    public String adicionar() {
        Vaga vagas = new Vaga(vagaEmpresa);
        empresas.adiciona(empresa);
        empresa.adicionarVaga(vagas);
        consultar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Empresa foi cadastrada com sucesso!"));
        
        return "/empresa/apresentar.xhtml";
    }

    public void alterar() {
        empresas.alterar(empresa);
    }

    public  Empresa getEmpresa() {
        return  empresa;
    }

    public List< Empresa> getTodosEmpresa() {
        return todasEmpresas;
    }
     public void detalhe( Empresa  empresa) {
        this.empresa = empresa;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    public List<Empresa> getTodasEmpresas() {
        return todasEmpresas;
    }

    public void setTodasEmpresas(List<Empresa> todasEmpresas) {
        this.todasEmpresas = todasEmpresas;
    }

    public String getVagaEmpresa() {
        return vagaEmpresa;
    }

    public void setVagaEmpresa(String vagaEmpresa) {
        this.vagaEmpresa = vagaEmpresa;
    }


}
