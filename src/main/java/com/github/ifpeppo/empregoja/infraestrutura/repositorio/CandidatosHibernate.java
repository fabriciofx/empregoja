/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.infraestrutura.repositorio;

import com.github.ifpeppo.empregoja.dominio.Candidato;
import com.github.ifpeppo.empregoja.dominio.repositorio.Candidatos;
import java.util.List;
import java.util.Objects;
import javax.persistence.TypedQuery;

/**
 *
 * @author everton
 */
public class CandidatosHibernate extends RepositorioHibernate<Candidato, Integer> implements Candidatos {

    @Override
    public List<Candidato> porNome(String nome) {
       Objects.requireNonNull(nome, "Nome inválido");
       
       return manager.createQuery("FROM Candidato c WHERE c.nome LIKE :nome")
                .setParameter("nome", "%" + nome + "%").getResultList();
    }
    
    
    @Override
    public List<Candidato> porCpf(String Cpf) {
        Objects.requireNonNull(Cpf, "cnpj inválido");

        TypedQuery<Candidato> query = manager.createQuery("FROM Empresa e WHERE e.cnpj LIKE :cnpj", Candidato.class);
        query.setParameter("cnpj", "%" + Cpf + "%");

        return query.getResultList();
    }  
}
