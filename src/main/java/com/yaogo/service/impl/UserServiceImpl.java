package com.yaogo.service.impl;

import com.yaogo.dal.UserRepo;
import com.yaogo.model.User;
import com.yaogo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User getUserById(Long id) {

        Optional<User> user = userRepo.findById(id);

        return user.orElseGet(User::new);
    }

    @Override
    public List<User> getAll(){
        return userRepo.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public void deleteUserById(Long id){
        userRepo.deleteById(id);
    }
}
