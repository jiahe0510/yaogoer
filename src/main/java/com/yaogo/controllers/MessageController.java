package com.yaogo.controllers;

import com.yaogo.model.Message;
import com.yaogo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

    @Autowired
    MessageService messageService;

    @PostMapping(path = "/msg", produces = "application/json")
    public ResponseEntity<Message> postMessage(@RequestBody Message msg) {
        Message msgWithId = messageService.postMessage(msg);
        return new ResponseEntity<>(msgWithId, HttpStatus.CREATED);
    }

    @GetMapping(path = {"/msg"})
    public ResponseEntity<Message> findAllMsgByMsgId(@RequestParam String id) {

        return new ResponseEntity<>(new Message(), HttpStatus.OK);
    }

}
