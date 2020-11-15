package com.yaogo.dal;

import com.yaogo.model.User;

import java.util.Optional;

public interface UserCustomRepo {

    Optional<User> findByUsername(String username);
}
