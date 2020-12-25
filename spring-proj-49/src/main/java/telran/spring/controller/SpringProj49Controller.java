package telran.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // controller for performing REST API upon HTTP protocol
public class SpringProj49Controller {
	// http://localhost:8080/calculator/add?op1=10&op2=20
	@GetMapping("/calculator/add")
	int add(int op1, int op2) {
		return op1 + op2;
	}
	// http://localhost:8080/calculator/sub?op1=10&op2=20
	@GetMapping("/calculator/sub")
	int subtract(int op1, int op2) {
		return op1 - op2;
	}
	// http://localhost:8080/calculator/mult?op1=10&op2=20
	@GetMapping("/calculator/mult")
	int multiply(int op1, int op2) {
		return op1 * op2;
	}
	// http://localhost:8080/calculator/div?op1=10&op2=20
	@GetMapping("/calculator/div")
	int divide(int op1, int op2) {
		return op1 / op2;
	}
}
