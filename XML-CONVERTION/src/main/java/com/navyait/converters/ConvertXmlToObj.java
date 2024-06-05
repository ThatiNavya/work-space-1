package com.navyait.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.navyait.bindings.Person;

public class ConvertXmlToObj {
	public static void main(String[] args) throws Exception {

		File xmlFile = new File("Person.xml");
		JAXBContext instance = JAXBContext.newInstance(Person.class);
		Unmarshaller unmarshaller = instance.createUnmarshaller();
		Object object = unmarshaller.unmarshal(xmlFile);
		Person person = (Person) object;
		System.out.println("Un-marshaller Completed");
		System.out.println(person);

	}
}
