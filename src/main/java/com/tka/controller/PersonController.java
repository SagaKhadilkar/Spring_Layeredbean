package com.tka.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Person;
import com.tka.service.PersonService;

@RestController
public class PersonController {
	@Autowired
PersonService service;
@GetMapping("/getalldetails")	
	ArrayList<Person> getAllDetails(){
		ArrayList<Person> plist = service.getAllDetails();
		
		return plist;
	}

}
