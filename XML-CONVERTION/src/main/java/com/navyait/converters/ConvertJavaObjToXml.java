package com.navyait.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.navyait.bindings.Person;
//Marshaling
public class ConvertJavaObjToXml {
	public static void main(String[] args) throws Exception {

		Person person = new Person(); //javaObj
		person.setId(101);
		person.setName("Navya");
		person.setAge(23);
		person.setLocation("Hyderabad"); 
		
		
		
		//To convert our javaObj to xml Jaxb-api providing Predefined class called JAXBContext
		JAXBContext newInstance = JAXBContext.newInstance(Person.class);
		
		Marshaller marshaller = newInstance.createMarshaller();
		marshaller.marshal(person, new File("Person.xml"));
		System.out.println("Marshalling Completed");
	}
}
