package com.yaogo.rest.controllers;

import com.yaogo.model.jpa.Message;
import com.yaogo.services.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/msg/")
public class MessageController {

    @Autowired
    MessageService messageService;

    @PostMapping(produces = "application/json")
    public ResponseEntity<Message> postMessage(@RequestBody Message msg) {
        Message msgWithId = messageService.postMessage(msg);
        return new ResponseEntity<>(msgWithId, HttpStatus.CREATED);
    }

}
