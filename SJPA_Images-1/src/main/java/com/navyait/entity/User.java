package com.navyait.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "USER_TABLE")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "USER_EMAIL")
	private String userEmail;

	@Column(name = "USER_IMAGE", length = 1024 * 1024)
	@Lob
	private byte[] userImage;

}
