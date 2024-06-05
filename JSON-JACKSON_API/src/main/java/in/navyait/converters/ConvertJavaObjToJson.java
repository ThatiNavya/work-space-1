package in.navyait.converters;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.navyait.bindings.Book;
import in.navyait.bindings.Person;

public class ConvertJavaObjToJson {

	public static void main(String[] args) throws Exception {
		
		
		Book book = new Book();
		book.setAuthor("Aldous Huxley");
		book.setId(52);
		book.setName("Brave New World");
		book.setPrice(1500.00);
		
		
		Person person = new Person();
		person.setAge(24);
		person.setEmail("navya12@gmail.com");
		person.setName("Navya");
		person.setLocation("Hyderabad");
		person.setBook(book);
		
		
		
	  ObjectMapper mapper = new ObjectMapper();	  //Jackson api Providing ObjectMapper class
	  mapper.writeValue(new File("person.json"), person);
	  System.out.println("Conversion Completed");
	  
	}
}
