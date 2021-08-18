package com.intuit;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WordController {

	@Autowired
	private WordService wordService;
	
	@GetMapping("/")
	public String getIndexPage() {
		return "index";
	}
	
	@PostMapping("/palindromecheck")
	public String checkPalindrome(@RequestParam String word, HttpSession session) {
		boolean result = wordService.isPalindrome(word);
		String message = word + " is ";
		if(!result) {
			message += "not ";
		} 
		message += "a palindrome";
		session.setAttribute("message", message);
		return "index";
	}
}
