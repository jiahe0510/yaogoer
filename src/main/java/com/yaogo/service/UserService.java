package com.yaogo.service;

import com.yaogo.model.User;

import java.util.List;

public interface UserService {

    User getUserById(Long id);

    List<User> getAll();

    User addUser(User user);

    void deleteUserById(Long id);
}
