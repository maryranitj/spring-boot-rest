package com.spring.boot.example.controller;

import java.text.MessageFormat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.example.model.Greeting;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingsController {

	private static Greeting greeting = new Greeting();

	/**
	 * Sample method handling GET method
	 * @param name
	 * @return
	 */
	@GetMapping(value = "/wish/{name}")
	public Greeting getGreeting(@PathVariable(name = "name") String name) {
		System.out.println("Name : " + name);
		greeting.setName(name);
		greeting.setContent(MessageFormat.format(greeting.getContent(), name));
		return greeting;

	}

	/**
	 * Sample method to handle POST method
	 * @param gr
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Greeting> addGreeting(Greeting gr) {
		System.out.println("The POST method");
		if (gr.getName() != null)
			greeting.setName(gr.getName());
		if (gr.getContent() != null)
			greeting.setContent(gr.getContent());
		String s = MessageFormat.format(greeting.getContent(), greeting.getName());
		System.out.println("Formatted greeting : " + s);
		greeting.setContent(s);
		return new ResponseEntity<Greeting>(greeting, HttpStatus.CREATED);
	}

}
