package com.transaction.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="PASSENGER_INFO")
public class PassengerInfo {
     @Id
     @GeneratedValue
	 private Long pId;
	 private String name;
	 private String email;
	 private String source;
	 private String Destination;
	 @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	 private Date travelDate;
	 private String pickupTime;
	 private String arrivelTime;
	 private double fare;
}
