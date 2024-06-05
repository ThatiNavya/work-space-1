package com.navyait.entity;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class TrainTicket {

	private String trainName;
	
	private Integer pnrNumber;
	
	private String trainFrom;
	
	private String trainTo;
	
    private String bookingStatus;
}
