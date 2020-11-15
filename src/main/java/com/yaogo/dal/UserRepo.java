package com.yaogo.dal;

import com.yaogo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends UserCustomRepo, JpaRepository<User, Long> {
}
