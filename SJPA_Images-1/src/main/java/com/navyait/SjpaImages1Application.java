package com.navyait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.navyait.service.ImageService;

@SpringBootApplication
public class SjpaImages1Application {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(SjpaImages1Application.class, args);
		ImageService imageService = context.getBean(ImageService.class);
		imageService.saveUser();
	}

}
