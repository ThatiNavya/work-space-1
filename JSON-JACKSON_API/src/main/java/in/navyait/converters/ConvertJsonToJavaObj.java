package in.navyait.converters;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.navyait.bindings.Person;

public class ConvertJsonToJavaObj {

	public static void main(String[] args) throws Exception {
		
		File file = new File("person.json");
		
		ObjectMapper mapper = new ObjectMapper();
		Person person = mapper.readValue(file, Person.class);
	    System.out.println("Conversion completed");
	    System.out.println(person);
	    
	}
}
 