package com.citius.servicey;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@GetMapping("/message")
	public ResponseEntity<String>  greet() {
		return new ResponseEntity<String>("Hello from Message Controller!!",HttpStatus.OK);
	}
	

	@PostMapping("/message")
	public ResponseEntity<String>  save(@RequestBody String str) {
		
		System.out.println(str);
		return new ResponseEntity<String>(str.toUpperCase(),HttpStatus.OK);
	}

}
