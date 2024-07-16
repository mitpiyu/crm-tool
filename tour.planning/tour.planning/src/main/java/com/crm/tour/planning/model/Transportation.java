package com.crm.tour.planning.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transportation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transportId;
	private String type;
	private String departure;
	private String arrival;
	@Temporal(TemporalType.TIMESTAMP)
	private Date departureTime;
	@Temporal(TemporalType.TIMESTAMP)
	private Date arrivalTime;

	@ManyToOne

	@JoinColumn(name = "tour_id")
	private Tour tour;

}