package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.entity.User;
import com.example.repository.UserRepository;

@SpringBootApplication
public class JpaRepositoryExample3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context1 = SpringApplication.run(JpaRepositoryExample3Application.class, args);
		UserRepository userRepository = context1.getBean(UserRepository.class);
		System.out.println(userRepository.getClass().getName());
		/*
		 * List<User> findAll = userRepository.findAll(Sort.by("age").descending());
		 * findAll.forEach(System.out::println);
		 */
		
		/*
		 * List<User> findAll =
		 * userRepository.findAll(Sort.by("username").descending());
		 * findAll.forEach(System.out::println);
		 */
	
          int pageNo =1;
          int pageSize =5;
          
          PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
          Page<User> page = userRepository.findAll(pageRequest);
          List<User> content = page.getContent();
          content.forEach(System.out::println);

          User usr = new User();
          usr.setAge(25);
          usr.setUsername("Navaneetha");
          
          Example ex =Example.of(usr);
          List findAll = userRepository.findAll(ex);
          findAll.forEach(System.out::println);
	
	
	}
	
	
	
	

}
