package com.cjx.spring.dao.master;

import com.cjx.spring.domain.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityDao {

    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<City> findAllCity();

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);

    City findById(@Param("id") Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(@Param("id") Long id);
}
