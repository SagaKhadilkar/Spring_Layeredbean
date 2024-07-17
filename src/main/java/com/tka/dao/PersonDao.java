package com.tka.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.tka.entity.Person;
@Repository
public class PersonDao {
	public ArrayList<Person> getAllDetails() {
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person(1, "Paneer", 5, "Dairy", 650));
		plist.add(new Person(2, "Milk", 10, "Dairy", 200));
		plist.add(new Person(3, "Curd", 20, "Dairy", 120));
		plist.add(new Person(4, "AC", 3, "Electronics", 45000));
		plist.add(new Person(5, "Cooler", 15, "Electronics", 10000));
		plist.add(new Person(6, "Fan", 6, "Electronics", 2000));
		plist.add(new Person(7, "Pencil", 10, "Stationary", 20));
		plist.add(new Person(8, "Pen", 20, "Stationary", 130));
		plist.add(new Person(9, "Book", 40, "Stationary", 400));
		return plist;
	}
}
