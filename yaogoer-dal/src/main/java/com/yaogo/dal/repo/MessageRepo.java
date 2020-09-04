package com.yaogo.dal.repo;

import com.yaogo.model.pojo.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo extends JpaRepository<Message, Long>, MessageRepoCustomRepo {

}
