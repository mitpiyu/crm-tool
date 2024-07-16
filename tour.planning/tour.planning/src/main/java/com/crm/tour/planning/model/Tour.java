package com.crm.tour.planning.model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tour {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private String tourId;
	private String tourName;
	private String description;
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	private double price;
	private String destination;
	private String tourType;

	@OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
	private List<Itinerary> itinerary;

	@OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
	private List<Participants> participants;

	@OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
	private List<Transportation> transportations;

	@OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
	private List<Accommodation> accommodations;

	@OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
	private List<Meal> meals;

	@PrePersist
	private void ensureTourId() {
		if (tourId == null) {
			tourId = "raj" + UUID.randomUUID();
		}
	}

	@Override
	public String toString() {
		return "Tour [tourId=" + tourId + ", tourName=" + tourName + ", description=" + description + ", startDate="
				+ startDate + ", endDate=" + endDate + ", price=" + price + ", destination=" + destination
				+ ", tourType=" + tourType + "]";
	}
}