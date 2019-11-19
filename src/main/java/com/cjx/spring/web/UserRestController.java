package com.cjx.spring.web;

import com.cjx.spring.domain.User;
import com.cjx.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @Autowired
    private UserService  userService;

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public User getByName(@RequestParam(value = "userName", required = true) String userName) {

        return userService.findByName(userName);
    }
}
