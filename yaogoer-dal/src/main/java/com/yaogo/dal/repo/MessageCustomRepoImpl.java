package com.yaogo.dal.repo;


import com.yaogo.model.pojo.Message;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Optional;

public class MessageCustomRepoImpl implements MessageCustomRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Message> findCommentMsgWithMostComments(Long msgId) {

        String query = "SELECT * FROM yaogo_db.msg_tbl " +
                "WHERE msg_id =: msgId";

        Query nativeQuery = entityManager.createNativeQuery(query);
        nativeQuery.setParameter("msgId", msgId);

        final Object obj = nativeQuery.getSingleResult();

        Message msg = convertObjectToMessage(obj);
        return Optional.of(msg);
    }

    private Message convertObjectToMessage(Object obj) {
        return new Message();
    }
}
