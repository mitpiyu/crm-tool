package com.crm.tour.planning.model;

import java.util.Date;
import java.util.UUID;

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
public class Meal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID mealId;
	private String type;
	@Temporal(TemporalType.DATE)
	private Date date;
	private String time;
	private String location;
	private String dietaryRestrictions;

	@ManyToOne
	@JoinColumn(name = "tour_id")
	private Tour tour;
}
