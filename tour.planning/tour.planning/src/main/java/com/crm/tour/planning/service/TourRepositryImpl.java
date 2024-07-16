package com.crm.tour.planning.service;

import org.hibernate.Session;
import org.hibernate.engine.spi.SessionImplementor;
import org.springframework.stereotype.Repository;

import com.crm.tour.planning.model.Tour;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class TourRepositryImpl implements TourRepository {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Tour save(Tour tour) {
		this.getCurrentSession().save(tour);
		return tour;
	}

	public Session getCurrentSession() {
		return em.unwrap(SessionImplementor.class);
	}

}
