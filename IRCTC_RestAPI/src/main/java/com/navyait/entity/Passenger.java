package com.navyait.entity;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Passenger {

	private String passengerName;

	private Integer passengerAge;

	private String passengerEmail;

	private String passengerGender;

	private String from;

	private String to;

	private String journeyDate;
}
