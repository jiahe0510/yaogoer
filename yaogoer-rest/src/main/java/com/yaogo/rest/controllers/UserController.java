package com.yaogo.rest.controllers;


import com.yaogo.model.pojo.User;
import com.yaogo.services.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path={"/", ""})
public class UserController {


    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path="/api/v1/{id}")
    public String getUserById(@PathVariable Long id) {
        User user = userService.getUserById(1L);
        return "haahha";
    }

    @GetMapping("")
    public String get() {
        userService.getUserById(1L);
        return "hello";
    }
}
