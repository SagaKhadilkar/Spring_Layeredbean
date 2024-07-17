package com.tka.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.PersonDao;
import com.tka.entity.Person;
@Service
public class PersonService {
@Autowired
	PersonDao dao;
	public ArrayList<Person> getAllDetails(){
		ArrayList<Person> filter = new ArrayList<Person>();
		ArrayList<Person> p1= dao.getAllDetails();
		for(Person p :p1) {
			if(!p.getPname().equals("AC")) {
				filter.add(p);
			}
				
		}
		return filter;
		
	}
}
