package com.crm.tour.planning.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.tour.planning.model.Tour;

public interface TourRepository extends JpaRepository<Tour, String> {

}
