package com.heymom.backend.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.heymom.backend.dao.CityDao;
import com.heymom.backend.dto.location.CityDto;
import com.heymom.backend.entity.location.City;
import com.heymom.backend.utils.DtoUtils;

@Service
public class CityService {
	@Autowired
	private CityDao cityDao;

	@Transactional(readOnly = true)
	public Map<String, List<CityDto>> ListAllCitiesGroupByFirstLetter() {
		List<City> cities = cityDao.findAllOrderByFirstLetter();
		return DtoUtils.cityDtoUtil.groupByFirstLetter(cities);
	}

	@Transactional(readOnly = true)
	public Map<String, List<CityDto>> ListAllDesinationsGroupByFirstLetter() {
		List<City> cities = cityDao.findByDeinationCities();
		return DtoUtils.cityDtoUtil.groupByFirstLetter(cities);
	}
}
