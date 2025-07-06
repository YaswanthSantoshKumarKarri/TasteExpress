package com.example.tasteexpress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.tasteexpress.entity")
public class TasteexpressApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasteexpressApplication.class, args);
	}
}
