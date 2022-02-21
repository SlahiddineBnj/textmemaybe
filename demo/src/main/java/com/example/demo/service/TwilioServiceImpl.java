package com.example.demo.service;

import com.example.demo.config.SmsRequest;
import com.example.demo.config.TwilioConfig;
import com.example.demo.dto.SmsDto;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TwilioServiceImpl  {
    private final TwilioConfig twilioConfig ;

    @Autowired
    public TwilioServiceImpl(TwilioConfig twilioConfig) {
        this.twilioConfig = twilioConfig;
    }

    public void sendSms(SmsRequest smsRequest) {
        MessageCreator creator = Message.creator(
                new PhoneNumber(smsRequest.getPhoneNumber()),
                new PhoneNumber(twilioConfig.getTwilioPhoneNumber()),
                smsRequest.getMessage()
        );
        creator.create() ;
    }
}
