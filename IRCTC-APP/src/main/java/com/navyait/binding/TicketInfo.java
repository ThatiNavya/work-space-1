package com.navyait.binding;

import lombok.Data;

@Data
public class TicketInfo {

	private Integer id;
	
	private Long pnrNo;
	
	private Long trainNo;
	
	private Integer berth;
	
	private String status;
}
//entiry repository connect autowired ->into service      
