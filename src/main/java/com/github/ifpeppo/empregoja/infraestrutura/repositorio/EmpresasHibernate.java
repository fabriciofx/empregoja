/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ifpeppo.empregoja.infraestrutura.repositorio;

import com.github.ifpeppo.empregoja.dominio.Empresa;
import com.github.ifpeppo.empregoja.dominio.repositorio.Empresas;
import java.util.List;
import java.util.Objects;
import javax.persistence.TypedQuery;
import org.hibernate.Query;

/**
 *
 * @author Jackson Carvalho
 */
public class EmpresasHibernate extends RepositorioHibernate<Empresa, Integer> implements Empresas {

    @Override
    public List<Empresa> porNome(String nome) {
        Objects.requireNonNull(nome, "nome inválido");

        return manager.createQuery("FROM Empresa e WHERE e.nome LIKE :nome")
                .setParameter("nome", "%" + nome + "%").getResultList();
    }

    @Override
    public List<Empresa> porCpf(String cnpj) {
        Objects.requireNonNull(cnpj, "cnpj inválido");

        TypedQuery<Empresa> query = manager.createQuery("FROM Empresa e WHERE e.cnpj LIKE :cnpj", Empresa.class);
        query.setParameter("cnpj", "%" + cnpj + "%");

        return query.getResultList();

    }
}
