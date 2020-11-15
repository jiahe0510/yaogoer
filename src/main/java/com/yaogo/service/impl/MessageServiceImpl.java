package com.yaogo.service.impl;

import com.yaogo.dal.MessageRepo;
import com.yaogo.model.Message;
import com.yaogo.service.MessageService;
import com.yaogo.utils.ServiceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageRepo messageRepo;

    @Override
    public Message postMessage(Message msg) {
        try {
            msg.setMsgDate(new Date());
            String msgId = ServiceUtils.generateMsgHashValue(msg);
            msg.setMsgId(msgId);
            messageRepo.save(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }
}
