package com.school.attendance.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SchoolMaintenanceSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolMaintenanceSystemApplication.class, args);
	}

}
