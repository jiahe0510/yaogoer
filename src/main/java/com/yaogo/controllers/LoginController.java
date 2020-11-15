package com.yaogo.controllers;

import com.yaogo.model.User;
import com.yaogo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = {"/api/v1", ""})
@CrossOrigin("*")
public class LoginController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private UserService userServiceImpl;

    @PostMapping(path = "/login", produces = "application/json")
    public ResponseEntity<User> login(@RequestBody User user) {

        Long id = user.getId();
        String password = user.getUserPassword();
        User actualUser = userServiceImpl.getUserById(id);
        String actualPassword = actualUser.getUserPassword();

        if (password.equals(actualPassword)) {
            return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
        }

        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);

    }

}
