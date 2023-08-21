package com.example.javarobotcontroller;

import java.lang.reflect.Method;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/api/robot")
public class JavaRobotControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaRobotControllerApplication.class, args);
	}

	@GetMapping("/moveForward")
	public String moveRobotForward() {
		// Call your robot move function here.
		return "Robot moved forward!";
	}

	@GetMapping("/turnLeft")
	public String turnRobotLeft() {
		// Call your robot move function here.
		return "Robot turned left!";
	}

	@GetMapping("/turnRight")
	public String turnRobotRight() {
		// Call your robot move function here.
		return "Robot turned right!";
	}

	@GetMapping("/moveBackwards")
	public String moveRobotBackwards() {
		// Call your robot move function here.
		return "Robot moved Backwards!";
	}

	@GetMapping("/stop")
	public String stopRobot() {
		// Call your robot stop function here.
		return "Robot stopped!";
	}

}
