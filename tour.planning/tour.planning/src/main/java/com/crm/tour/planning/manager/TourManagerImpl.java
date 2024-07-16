package com.crm.tour.planning.manager;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.tour.planning.model.Tour;
import com.crm.tour.planning.model.vo.TourRequestVo;
import com.crm.tour.planning.service.TourRepository;

@Service
@Transactional
public class TourManagerImpl implements TourManager {
	@Autowired
	private TourRepository tourRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	@Transactional()
	public Tour save(TourRequestVo tourRequestVo) {
		Tour tour = tourRepository.save(convertToTour(tourRequestVo));

		return tour;
	}

	private Tour convertToTour(TourRequestVo tourRequestVo) {

		Tour tour = modelMapper.map(tourRequestVo, Tour.class);

		/*
		 * Tour tour = new Tour(); BeanUtils.copyProperties(tourRequestVo, tour);
		 */

		return tour;
	}
}
