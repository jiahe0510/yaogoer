package com.yaogo.rest.controllers;


import com.yaogo.model.jpa.User;
import com.yaogo.services.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path={"/", ""})
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path="/api/v1/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping(path="/api/v1/user/")
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    

}
