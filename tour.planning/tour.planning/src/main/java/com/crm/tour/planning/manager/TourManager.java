package com.crm.tour.planning.manager;

import com.crm.tour.planning.model.Tour;
import com.crm.tour.planning.model.vo.TourRequestVo;

public interface TourManager {

	Tour save(TourRequestVo tourRequestVo);

}
