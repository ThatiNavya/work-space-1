package com.navyait.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="person") // to represent our java class as a Binding class
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder // To represent th data in the order
public class Person {

	@XmlElement(name="Person_Id")
	private Integer id;

	@XmlElement(name="Person_Name")
	private String name;

	@XmlElement(name="Person_Age")
	private Integer age;

	@XmlElement(name = "Address") //If variable don't want to participate in the Marhsalling
	private String location;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location + "]";
	}
}
