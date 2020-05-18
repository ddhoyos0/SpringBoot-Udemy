package com.djhoyos.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringBootBackendApirestApplication implements CommandLineRunner{

	@Autowired
	private BCryptPasswordEncoder pass;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApirestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String password = "deymer1990";
		for (int i = 0; i < 2; i++) {
			String pss = pass.encode(password);
			System.out.println(pss);
		}
		
	}

}