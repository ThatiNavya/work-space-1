package com.transaction.dto;

import org.springframework.stereotype.Component;

import com.transaction.entity.PassengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class FlightBookingAcknowledgement {

   private String status;
   private double totalFare;
   private String pnrNo;
   private PassengerInfo PassengerInfo;
}
