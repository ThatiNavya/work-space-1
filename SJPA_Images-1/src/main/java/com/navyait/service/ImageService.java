package com.navyait.service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navyait.entity.User;
import com.navyait.repository.ImageRepository;

@Service
public class ImageService {

	@Autowired
	private ImageRepository imageRepo;

	public void saveUser() throws Exception {

		String imagePath = "E:\\java.png";

		User user = new User();
		user.setUserName("Navya");
		user.setUserEmail("navya45@gmail.com");

		long size = Files.size(Paths.get(imagePath));

		byte[] arr = new byte[(int) size];
		FileInputStream fis = new FileInputStream(new File(imagePath));
		fis.read(arr);
		fis.close();

		user.setUserImage(arr);
		imageRepo.save(user);
	}

}
