package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.entity.Student;
import com.demo.repository.StudentRepo;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa1Application.class, args);
		
		
		  StudentRepo studentRepo = context.getBean(StudentRepo.class);
		  System.out.println(studentRepo.getClass().getName());
		 
	
		Student st1 = new Student(101, "Navya", 24, "Nalgonda");
		Student st2 = new Student(102, "Thirupathi", 26, "Hyderabad");
		Student st3 = new Student(103, "Sanandan", 28, "Hyderabad");
		Student st4 = new Student(104, "TejaDurga", 25, "Vizag");
		Student st5 = new Student(105, "Sujatha", 23, "Pune");
		Student st6 = new Student(106, "TejaHarsha", 22, "Mumbai");

		// studentRepo.save(st1);

		
		
		  List<Student> listofStudents = Arrays.asList(st1, st2, st3, st4, st5, st6);
		  studentRepo.saveAll(listofStudents);
		 
		
		/*
		 * Optional<Student> StudentName = studentRepo.findById(101);
		 * System.out.println(StudentName.get().getStudentName());
		 */

		/*
		 * StudentRepo studentRepo = context.getBean(StudentRepo.class);
		 * Optional<Student> findById = studentRepo.findById(103);
		 * if(findById.isPresent()) { Student student = findById.get();
		 * System.out.println(student.getStudentId()+" "+student.getStudentName()+" "
		 * +student.getStudentAge()+" "+student.getStudentLocation()); }
		 */
		
		/*
		 * StudentRepo studentRepo = context.getBean(StudentRepo.class); List<Integer>
		 * listOfIds = Arrays.asList(101,102,103,104,105,106); Iterable<Student>
		 * findAllById = studentRepo.findAllById(listOfIds);
		 * //findAllById.forEach(System.out::println);
		 * findAllById.forEach(Student->System.out.println(Student));
		 */
		
		 
		/* StudentRepo studentRepo = context.getBean(StudentRepo.class);
		 * Iterable<Student> findAll = studentRepo.findAll();
		 * findAll.forEach(System.out::println);
		 */
	    
	    
		/*
		 * StudentRepo studentRepo = context.getBean(StudentRepo.class); long
		 * studentsCount = studentRepo.count();
		 * System.out.println("StudentsCount: "+studentsCount);
		 */
	    
	    
		/*
		 * StudentRepo studentRepo =context.getBean(StudentRepo.class); boolean
		 * existsById = studentRepo.existsById(102); System.out.println(existsById);
		 */
	    
		/*
		 * StudentRepo studentRepo = context.getBean(StudentRepo.class);
		 * studentRepo.deleteById(103);
		 */
	    
		//StudentRepo studentRepo = context.getBean(StudentRepo.class);
		/*
		 * List<Student> findBystudentName =
		 * studentRepo.findByStudentName("Thirupathi");
		 * System.out.println(findBystudentName);
		 * 
		 * System.out.println("Student Data Inserted Successfully");
		 */
		
		
		/*
		 * Student st = new Student(); st.setStudentId(107);
		 * st.setStudentName("manasa"); st.setStudentAge(22);
		 * st.setStudentLocation("hyd");
		 * 
		 * Student student = studentRepo.save(st);
		 * 
		 * 
		 * Student st1 = new Student(); st.setStudentId(108);
		 * st.setStudentName("kavya"); st.setStudentAge(23);
		 * st.setStudentLocation("kammam");
		 * 
		 * Student student1 = studentRepo.save(st);
		 * 
		 * 
		 * Student st2 = new Student(); st.setStudentId(108);
		 * st.setStudentName("kavya"); st.setStudentAge(23);
		 * st.setStudentLocation("kammam");
		 * 
		 * Student student2 = studentRepo.save(st);
		 */
	}

}
