package com.heymom.backend.entity.location;

import java.util.Map;

import javax.persistence.Table;

public class Hotel extends BaseLocationEntity {
	public static enum RoomType {
		DELUXE, DOUBLE, KINGSIZE, OTHER, SINGLE, TRIPLE
	};

	Map<String, Float> prices;
	int rank;
	String room;

	public Map<String, Float> getPrices() {
		return prices;
	}

	public int getRank() {
		return rank;
	}

	public void setPrices(Map<String, Float> prices) {
		this.prices = prices;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}
