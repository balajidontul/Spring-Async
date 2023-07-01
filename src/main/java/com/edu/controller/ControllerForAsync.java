package com.edu.controller;

import java.time.Instant;

import org.apache.coyote.http11.Http11InputBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControllerForAsync {

	@GetMapping
	public ResponseEntity<String> getTreadTime() throws Exception {
		String startinstant = Instant.now().toString();
		Thread.sleep(10000);
		String endinstant = Instant.now().toString();
		String rString = "Start time :".concat(startinstant).concat("End time :").concat(endinstant);
		return new ResponseEntity<>(rString, HttpStatus.OK); 
	}
	
}
