package com.example.springbootintellij;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/indexpage")
@SpringBootApplication
public class SpringbootintellijApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootintellijApplication.class, args);
	}

	@GetMapping()
	public String index(){
		return "Index Page";
	}
}
