package com.cjx.spring.service;

import com.cjx.spring.domain.City;

public interface CityService {

    City getCityByName(String cityName);

    City getCityByNameAnno(String cityName);
}
