package com.heymom.backend.service;

import java.util.Collection;
import java.util.Date;

import com.heymom.backend.dto.location.Location;
import com.heymom.backend.dto.transport.TransportBase;

public class TransportationDataService {
	public Collection<TransportBase> getAvailableTransports(Date startTime, Location leaveLocation,
			Location arriveLocation, TransportBase.Method[] methods) {
		return null;
	}
}
