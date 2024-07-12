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
@AllArgsConstructor
@NoArgsConstructor
public class Participants {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String participantId;
	private String name;
	private String email;
	private String phone;
	private int age;
	private String preferences;

	@ManyToOne
	@JoinColumn(name = "tour_id")
	private Tour tour;

}
