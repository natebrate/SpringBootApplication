package com.example.WebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class WebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppApplication.class, args);

		/*
		Encrypt the user passwords
		 */
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "password"; //place user password here
		String encodedPassword = encoder.encode(rawPassword);

		System.out.println(encodedPassword);
	}

}
