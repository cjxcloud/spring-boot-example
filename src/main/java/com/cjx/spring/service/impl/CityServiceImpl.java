package com.cjx.spring.service.impl;

import com.cjx.spring.dao.AnnoCityDao;
import com.cjx.spring.dao.CityDao;
import com.cjx.spring.domain.City;
import com.cjx.spring.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceImpl.class);

    @Autowired
    private CityDao cityDao;

    @Autowired
    private AnnoCityDao annoCityDao;

    @Override
    public City getCityByName(String cityName) {

        return cityDao.findByName(cityName);

    }

    @Override
    public City getCityByNameAnno(String cityName) {
        return annoCityDao.findByName(cityName);
    }
}
