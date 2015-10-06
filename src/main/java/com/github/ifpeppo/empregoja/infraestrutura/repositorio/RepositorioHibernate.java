package com.github.ifpeppo.empregoja.infraestrutura.repositorio;

import com.github.ifpeppo.empregoja.dominio.repositorio.Repositorio;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class RepositorioHibernate<T, I> implements Repositorio<T, I>, Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    protected EntityManager manager;

    protected Class<T> obterClasseEntidade() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        Class<T> type = (Class<T>) parameterizedType.getActualTypeArguments()[0];

        return type;
    }

    @Override
    public void adiciona(T objeto) {
        manager.getTransaction().begin();
        manager.merge(objeto);
        manager.getTransaction().commit();
    }

    @Override
    public T procura(I i) {
        return manager.find(obterClasseEntidade(), i);
    }

    @Override
    public List<T> todos() {
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(obterClasseEntidade());
        Root<T> from = criteriaQuery.from(obterClasseEntidade());
        criteriaQuery.select(from);

        TypedQuery<T> typedQuery = manager.createQuery(criteriaQuery);

        return typedQuery.getResultList();
    }

    public void altera(T objeto) {
        manager.merge(objeto);
    }

    public void remove(I i) {
        manager.remove(procura(i));
    }
}
