package com.devisis.apibandas.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.devisis.apibandas.entity.Bandas;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


@Repository
public class BandasDAOImpl implements BandasDAO{
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
    public List < Bandas > getBandas() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < Bandas > cq = cb.createQuery(Bandas.class);
        Root < Bandas > root = cq.from(Bandas.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void deleteBandas(int id) {
        Session session = sessionFactory.getCurrentSession();
        Bandas book = session.byId(Bandas.class).load(id);
        session.delete(book);
    }

    @Override
    public void saveBandas(Bandas theBanda) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theBanda);
    }

    @Override
    public Bandas getBandas(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Bandas theBanda = currentSession.get(Bandas.class, theId);
        return theBanda;
    }
}
