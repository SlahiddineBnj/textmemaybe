package com.example.demo.dto;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class SmsDto {
    private String number ;
    private String message ;
    private LocalDate message_time ;
}
