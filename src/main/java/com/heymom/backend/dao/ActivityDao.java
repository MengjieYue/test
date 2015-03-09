package com.heymom.backend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.heymom.backend.entity.Activity;

public interface ActivityDao extends BaseDao<Activity, Integer> {
	@Query("from Activity where startDate<= CURRENT_DATE  and endDate>= CURRENT_DATE")
	public List<Activity> findByTodayActivities();
}
