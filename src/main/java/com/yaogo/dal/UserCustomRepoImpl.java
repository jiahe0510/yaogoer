package com.yaogo.dal;

import com.yaogo.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Optional;

public class UserCustomRepoImpl implements UserCustomRepo {

    @Autowired
    EntityManager em;

    @Override
    public Optional<User> findByUsername(String username) {

        Query query = em.createNativeQuery(
                "select * from yaogoer.user " +
                        "where user_name = :username");
        query.setParameter("username", username);
        User user = (User)query.getSingleResult();

        return Optional.of(user);
    }
}
