package com.cjx.spring.web;

import com.cjx.spring.domain.City;
import com.cjx.spring.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/api/{id}/city", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id) {

        return cityService.findCityById(id);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public void createCity(@RequestBody City city) {
        cityService.saveCity(city);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city) {
        cityService.updateCity(city);
    }

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Long id) {
        cityService.deleteCity(id);
    }
}
