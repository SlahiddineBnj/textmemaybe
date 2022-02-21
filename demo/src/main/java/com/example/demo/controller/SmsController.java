package com.example.demo.controller;


import com.example.demo.config.SmsRequest;
import com.example.demo.dto.SmsDto;
import com.example.demo.service.TwilioServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sms")
public class SmsController {

    private final TwilioServiceImpl twilioService ;

    @Autowired
    public SmsController(TwilioServiceImpl twilioService) {
        this.twilioService = twilioService;
    }

    @PostMapping
    public void sendSms(@RequestBody SmsRequest request){
        twilioService.sendSms(request);
    }


}
