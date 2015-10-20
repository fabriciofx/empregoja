/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.dominio.repositorio;

import com.github.ifpeppo.empregoja.dominio.Candidato;
import java.util.List;

/**
 *
 * @author everton
 */
public interface Candidatos extends Repositorio<Candidato, Integer> {
    
    public List<Candidato> porNome(String nome);
    
    public List<Candidato> porCpf(String Cpf);
    
    public void alterar(Candidato candidato);
}
