package com.yaogo.services.service.impl;

import com.yaogo.dal.repo.UserRepo;
import com.yaogo.model.jpa.User;
import com.yaogo.services.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User getUserById(Long id) {

        Optional<User> user = userRepo.findById(id);

        return user.orElseGet(User::new);
    }

    public List<User> getAll(){
        return userRepo.findAll();
    }
}
