package com.yaogo.dal.repo;

import com.yaogo.model.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends UserCustomRepo, JpaRepository<User, Long> {
}
