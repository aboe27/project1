package com.example.apartemen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApartemenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApartemenApplication.class, args);
		Penghuni penghuni;
		penghuni = new Penghuni();
		penghuni.setNama("aboe");
		System.out.println(penghuni.getNama());
	}

}
