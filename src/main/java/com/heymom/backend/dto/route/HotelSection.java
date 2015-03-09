package com.heymom.backend.dto.route;

import java.util.Date;

import com.heymom.backend.dto.location.HotelDto;
import com.heymom.backend.dto.location.HotelDto.RoomType;

public class HotelSection extends StaySection {

	public HotelSection(HotelDto hotelDto, Date startTime, Date endTime, RoomType roomType) {
		super(hotelDto, startTime, endTime, hotelDto.getPrices().get(roomType));
	}

}
