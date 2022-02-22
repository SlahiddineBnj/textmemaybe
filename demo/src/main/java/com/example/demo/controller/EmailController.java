package com.example.demo.controller;


import com.example.demo.config.SmsRequest;
import com.example.demo.dto.EmailDto;
import com.example.demo.service.EmailService;
import com.example.demo.service.TwilioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService ;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public void sendEmail(@RequestBody EmailDto email){
        emailService.sendSimpleMessage(email);
    }


}
