package com.navyait.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.navyait.entity.Passenger;
import com.navyait.entity.TrainTicket;

@RestController
public class TrainController {

	@PostMapping(value = "/passenger", consumes = { "application/xml", "application/json" })
	public ResponseEntity<String> addbookDetails(@RequestBody Passenger passenger) {

		System.out.println(passenger);
		String status = "Booking details Confirmed";

		return new ResponseEntity<String>(status, HttpStatus.CREATED);

	}

	@GetMapping(value = "/traindetails", produces = { "application/xml", "application/json" })
	public ResponseEntity<TrainTicket> getbookStatus() {

		TrainTicket trainTicket = new TrainTicket();
		trainTicket.setPnrNumber(59638147);
		trainTicket.setTrainName("YaswanthPur");
		trainTicket.setTrainFrom("Hyderabad");
		trainTicket.setTrainTo("mumbai");
		trainTicket.setBookingStatus("Confirmed");

		return new ResponseEntity<TrainTicket>(trainTicket, HttpStatus.OK);

	}
}
