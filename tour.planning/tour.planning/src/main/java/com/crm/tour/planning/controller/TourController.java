package com.crm.tour.planning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crm.tour.planning.manager.TourManager;
import com.crm.tour.planning.model.Tour;
import com.crm.tour.planning.model.vo.SavedVo;
import com.crm.tour.planning.model.vo.TourRequestVo;

import jakarta.servlet.http.HttpServletRequest;

@RestController("TourController")
@RequestMapping("/v1/tour")
public class TourController {
	@Autowired
	private TourManager tourManager;

	/*
	 * @RequestMapping(method = RequestMethod.POST)
	 */
	@PostMapping(consumes = "application/json")
	@ResponseBody
	public ResponseEntity<SavedVo> create(@RequestBody TourRequestVo tourRequestVo) {
		Tour result = tourManager.save(tourRequestVo);
		return new ResponseEntity(new SavedVo(result.getTourId()), HttpStatus.OK);
	}
}
