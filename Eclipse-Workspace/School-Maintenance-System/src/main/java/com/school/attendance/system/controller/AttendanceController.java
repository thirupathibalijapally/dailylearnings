package com.school.attendance.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendanceController {

	@GetMapping("/")
	public String getWelcome() {
		return "Welcome to the world";
	}
}
