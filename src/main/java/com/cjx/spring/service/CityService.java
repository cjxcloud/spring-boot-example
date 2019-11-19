package com.cjx.spring.service;

import com.cjx.spring.domain.City;

public interface CityService {

    City getCityByName(String cityName);

    City getCityByNameAnno(String cityName);

    City findCityById(Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
