/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.infraestrutura.repositorio;

import com.github.ifpeppo.empregoja.dominio.Conhecimento;
import com.github.ifpeppo.empregoja.dominio.repositorio.Conhecimentos;
import java.util.List;

/**
 *
 * @author fbc
 */
public class ConhecimentosHibernate extends RepositorioHibernate<Conhecimento, Integer> implements Conhecimentos {

    @Override
    public List<Conhecimento> porDescricao(String descricao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
