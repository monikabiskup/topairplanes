package com.topairplanes.springboot.topairplanes.dao;

import com.topairplanes.springboot.topairplanes.entity.BiggestAirplane;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class BiggestAirplaneDAOHibernateImpl implements BiggestAirplaneDAO {

    private EntityManager entityManager;

    @Autowired
    public BiggestAirplaneDAOHibernateImpl(EntityManager theEntityManager){
        entityManager=theEntityManager;
    }

    @Override
    @Transactional
    public List<BiggestAirplane> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<BiggestAirplane> theQuery = currentSession.createQuery("from BiggestAirplane", BiggestAirplane.class);
        List<BiggestAirplane> biggestAirplanes = theQuery.getResultList();
        return biggestAirplanes;
    }
}
