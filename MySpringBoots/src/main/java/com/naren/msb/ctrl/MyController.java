package com.naren.msb.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/metrics")
	String get() {
		return "Hello World!";
	}
}
