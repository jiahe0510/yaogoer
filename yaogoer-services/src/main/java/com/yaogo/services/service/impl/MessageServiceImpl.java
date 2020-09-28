package com.yaogo.services.service.impl;

import com.yaogo.dal.repo.MessageRepo;
import com.yaogo.model.jpa.Message;
import com.yaogo.services.service.MessageService;
import com.yaogo.services.utils.ServiceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageRepo messageRepo;

    @Override
    public Message postMessage(Message msg) {
        try {
            String msgId = ServiceUtils.generateMsgHashValue(msg);
            msg.setMsgId(msgId);
            messageRepo.save(msg);
        } catch (Exception e) {
            System.out.println("hahahhahha");
        }
        return msg;
    }
}
