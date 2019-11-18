package com.cjx.spring.dao;

import com.cjx.spring.domain.City;
import org.apache.ibatis.annotations.*;

@Mapper // 标志为 Mybatis 的 Mapper
public interface AnnoCityDao {

    @Select("SELECT * FROM city")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "provinceId", column = "province_id"),
            @Result(property = "cityName", column = "city_name"),
            @Result(property = "description", column = "description"),
    })
    City findByName(@Param("cityName") String cityName);
}
