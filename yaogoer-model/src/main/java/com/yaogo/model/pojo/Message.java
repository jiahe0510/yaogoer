package com.yaogo.model.pojo;

import java.util.Date;

public class Message {

    private Long msgId;
    private Long msgParentId;
    private Long userId;
    private Date msgDate;
    private String msgData;

    public Message() {
    }

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public Long getMsgParentId() {
        return msgParentId;
    }

    public void setMsgParentId(Long msgParentId) {
        this.msgParentId = msgParentId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getMsgDate() {
        return msgDate;
    }

    public void setMsgDate(Date msgDate) {
        this.msgDate = msgDate;
    }

    public String getMsgData() {
        return msgData;
    }

    public void setMsgData(String msgData) {
        this.msgData = msgData;
    }

}
