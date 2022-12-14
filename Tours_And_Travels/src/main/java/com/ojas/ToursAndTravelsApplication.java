package com.ojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class ToursAndTravelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToursAndTravelsApplication.class, args);
	}

}
