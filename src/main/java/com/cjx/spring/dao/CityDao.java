package com.cjx.spring.dao;

import com.cjx.spring.domain.City;
import org.apache.ibatis.annotations.Param;

public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);
}
