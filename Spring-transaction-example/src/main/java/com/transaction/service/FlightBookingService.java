package com.transaction.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.dto.FlightBookingAcknowledgement;
import com.transaction.dto.FlightBookingRequest;
import com.transaction.entity.PassengerInfo;
import com.transaction.entity.PaymentInfo;
import com.transaction.repository.PassengerInfoRepository;
import com.transaction.repository.PaymentInfoRepository;
import com.transaction.utils.PaymentUtils;

import jakarta.transaction.Transactional;
@Service
public class FlightBookingService {

	@Autowired
	private PassengerInfoRepository passengerInfoRepository;
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	
   @Transactional
	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {

		PassengerInfo passengerInfo = request.getPassengerInfo();
		passengerInfo = passengerInfoRepository.save(passengerInfo);

		PaymentInfo paymentInfo = request.getPaymentInfo();

		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());

		paymentInfo.setPassengerId(passengerInfo.getPId());
		paymentInfo.setAmount(passengerInfo.getFare());
		paymentInfoRepository.save(paymentInfo);

		return new FlightBookingAcknowledgement("SUCCESS", passengerInfo.getFare(),
				UUID.randomUUID().toString().split("-")[0], passengerInfo);

	}

}
