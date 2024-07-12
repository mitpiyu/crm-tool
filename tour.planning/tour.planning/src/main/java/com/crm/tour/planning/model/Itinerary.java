package com.crm.tour.planning.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Itinerary {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String itineraryId;
	private int day;
	private String activity;
	private String location;
	private String startTime;
	private String endTime;

	@ManyToOne
	@JoinColumn(name = "tour_id")
	private Tour tour;

}
