package com.cjx.spring.service.impl;

import com.cjx.spring.dao.cluster.UserDao;
import com.cjx.spring.dao.master.CityDao;
import com.cjx.spring.domain.City;
import com.cjx.spring.domain.User;
import com.cjx.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao; // 主数据源

    @Autowired
    private CityDao cityDao; // 从数据源

    @Override
    public User findByName(String userName) {
        User user = userDao.findByName(userName);
        City city = cityDao.findByName("温岭市");
        user.setCity(city);
        return user;
    }

}
