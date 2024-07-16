package com.crm.tour.planning.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SavedVo {

	private String id;

	public static SavedVo of(final String id) {
		return new SavedVo(id);
	}

}
