/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.dominio.repositorio;



import com.github.ifpeppo.empregoja.dominio.Empresa;
import com.github.ifpeppo.empregoja.dominio.repositorio.Repositorio;
import java.util.List;

/**
 *
 * @author Jackson Carvalho
 */
public interface Empresas extends Repositorio<Empresa, Integer> {

    public List<Empresa> porNome(String nome);

    public List<Empresa> porCpf(String cnpj);
    
    public void alterar(Empresa empresa);
}