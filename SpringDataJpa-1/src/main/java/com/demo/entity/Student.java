package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="STUDENT_DETAILS")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="Id")
   private Integer studentId;
	@Column(name="Name")
   private String studentName;
	@Column(name="Age")
   private Integer studentAge;
	@Column(name="Location")
   private String studentLocation;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentLocation=" + studentLocation + "]";
	}
}

