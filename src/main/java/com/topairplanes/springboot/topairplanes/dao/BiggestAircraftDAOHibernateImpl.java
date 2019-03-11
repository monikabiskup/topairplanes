package com.topairplanes.springboot.topairplanes.dao;

import com.topairplanes.springboot.topairplanes.entity.BiggestAircraft;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class BiggestAircraftDAOHibernateImpl implements BiggestAircraftDAO {

    private EntityManager entityManager;

    @Autowired
    public BiggestAircraftDAOHibernateImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public List<BiggestAircraft> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<BiggestAircraft> theQuery = currentSession.createQuery("from BiggestAirplane", BiggestAircraft.class);
        List<BiggestAircraft> biggestAircrafts = theQuery.getResultList();
        return biggestAircrafts;
    }
}
