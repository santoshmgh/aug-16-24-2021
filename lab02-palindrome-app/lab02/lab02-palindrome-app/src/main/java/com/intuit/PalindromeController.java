package com.intuit;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/palindrome")
public class PalindromeController {
	
	@GetMapping("/{word}")
	public HttpEntity<Boolean> isPalindrome(@PathVariable String word) {
		StringBuffer sb = new StringBuffer(word);
		String reversedWord = sb.reverse().toString();
		return new ResponseEntity<>(word.equals(reversedWord), HttpStatus.OK);
	}
}
