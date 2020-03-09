package com.Capitals.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello Message";
	}
}
