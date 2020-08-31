package com.yaogo.services.service.impl;

import com.yaogo.model.pojo.User;
import com.yaogo.services.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Long id) {
        System.out.println("hahahhahahhahhah");
        return new User(1L);
    }
}
