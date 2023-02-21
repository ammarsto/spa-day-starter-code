package org.launchcode.spaday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("user")
public class SpaDayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpaDayApplication.class, args);
	}

}
