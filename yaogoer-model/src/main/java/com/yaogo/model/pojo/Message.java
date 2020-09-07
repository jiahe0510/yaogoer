package com.yaogo.model.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="message")
public class Message {

    @Id
    @Column(name = "msg_id")
    private Long msgId;

    @Column(name = "msg_parentid")
    private Long msgParentId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "msg_date")
    private Date msgDate;

    @Column(name = "msg_data")
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
