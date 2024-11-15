package com.safetrabel.safetrabel_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = "com.safetrabel.safetrabel_api")
@SpringBootApplication
public class SafetrabelApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafetrabelApiApplication.class, args);
	}

}
