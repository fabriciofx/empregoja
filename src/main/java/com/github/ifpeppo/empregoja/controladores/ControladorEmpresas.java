/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.controladores;

import com.github.ifpeppo.empregoja.dominio.Empresa;
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
    private List< Empresa> todosEmpresas;

    public void consultar() {
        todosEmpresas =  empresas.todos();
    }

    public void novo() {
         empresa = new  Empresa();
    }

    public String adicionar() {
         empresas.adiciona(empresa);
        consultar();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(" Empresa cadastrada com sucesso!"));
        
        return "ApresentaEmpresa.xhtml";
    }

    public void alterar() {
        empresas.alterar(empresa);
    }

    public  Empresa getEmpresa() {
        return  empresa;
    }

    public List< Empresa> getTodosEmpresa() {
        return todosEmpresas;
    }
     public void detalhe( Empresa  empresa) {
        this.empresa = empresa;
    }
}