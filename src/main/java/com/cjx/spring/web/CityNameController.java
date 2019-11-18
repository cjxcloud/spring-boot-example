package com.cjx.spring.web;

import com.cjx.spring.domain.City;
import com.cjx.spring.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityNameController {

    @Autowired
    private CityService cityService;

    @GetMapping(value = "/api/getCity")
    public City getCity(@RequestParam(value = "cityName", required = true) String cityName) {

        return cityService.getCityByName(cityName);
    }

    @GetMapping(value = "/api/getCityAnno")
    public City getCityAnno(@RequestParam(value = "cityName", required = true) String cityName) {

        return cityService.getCityByName(cityName);
    }
}
