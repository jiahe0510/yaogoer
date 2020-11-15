package com.yaogo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "message")
public class Message {

    @Id
    @Column(name = "msg_id")
    private String msgId;

    @Column(name = "msg_parentid")
    private String msgParentId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "msg_date")
    private Date msgDate;

    @Column(name = "msg_data")
    private String msgData;

    public Message() {
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getMsgParentId() {
        return msgParentId;
    }

    public void setMsgParentId(String msgParentId) {
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
