package com.yaogo.dal.repo;

import com.yaogo.model.pojo.Message;

import java.util.Optional;

public interface MessageCustomRepo {

    Optional<Message> findCommentMsgWithMostComments(Long msgId);

}
