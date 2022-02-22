package com.example.demo.service;

import com.example.demo.dto.EmailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(
            EmailDto emailDto) {

        String to = emailDto.getTo() ;
        String subject = emailDto.getSubject();
        String text = emailDto.getText();
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("slahiddinebnj123@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);

    }
}