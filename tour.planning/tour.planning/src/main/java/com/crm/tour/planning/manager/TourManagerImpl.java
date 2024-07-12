package com.crm.tour.planning.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.tour.planning.service.TourRepository;

@Service
public class TourManagerImpl implements TourManager {
	@Autowired
	private TourRepository tourRepository;
}
