 package com.navyait.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Product {
 
	private Integer id;
	
	private String name;
	
	private Double price;




}
