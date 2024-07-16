package com.crm.tour.planning.model.vo;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TourRequestVo {

	//private String tourId;
	private String tourName;
	private String description;
	private Date startDate;
	private Date endDate;
	private double price;
	private String destination;
	private String tourType;
	private List<ItineraryVo> itinerary;
	private List<participantsVo> participants;
	private List<TransportationVo> transportations;
	private List<AccommodationVo> accommodations;
	private List<MealVo> meals;

	@Data
	@NoArgsConstructor
	public static class ItineraryVo {
		private Long itineraryId;
		private int day;
		private String activity;
		private String location;
		private String startTime;
		private String endTime;
	}

	@Data
	@NoArgsConstructor
	public static class participantsVo {
		private Long participantId;
		private String name;
		private String email;
		private String phone;
		private int age;
		private String preferences;
	}

	@Data
	@NoArgsConstructor
	public static class TransportationVo {
		private Long transportId;
		private String type;
		private String departure;
		private String arrival;
		private Date departureTime;
		private Date arrivalTime;
	}

	@Data
	@NoArgsConstructor
	public static class AccommodationVo {
		private Long accommodationId;
		private String name;
		private String address;
		private Date checkInDate;
		private Date checkOutDate;
		private String roomType;
	}

	@Data
	@NoArgsConstructor
	public static class MealVo {
		private Long mealId;
		private String type;
		private Date date;
		private String time;
		private String location;
		private String dietaryRestrictions;
	}

}
