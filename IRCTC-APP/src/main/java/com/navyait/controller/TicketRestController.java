package com.navyait.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.navyait.binding.PassengerInfo;
import com.navyait.binding.TicketInfo;

@RestController
public class TicketRestController {

	@PostMapping("/ticketDetails")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo request) {

		System.out.println(request);

		TicketInfo ticket = new TicketInfo();
		ticket.setId(509);
		ticket.setPnrNo(65145115l);
		ticket.setTrainNo(25525l);
		ticket.setBerth(48);
		ticket.setStatus("Ticket Confirmed");

		return new ResponseEntity<>(ticket, HttpStatus.CREATED);

	}

	@PutMapping("/update Ticket Details/{ticketId}")
	public ResponseEntity<String> updateTicket(@PathVariable("ticketId") Integer request) {

		System.out.println(request);

		return new ResponseEntity<String>("Ticket updated", HttpStatus.OK);
	}

	@DeleteMapping("/deleteTicket/{ticketId}")
	public ResponseEntity<String> deleteTicket(@PathVariable("ticketId") Integer ticketId) {

		System.out.println(ticketId);

		return new ResponseEntity<String>("Ticket deleted", HttpStatus.OK);
	}

}
