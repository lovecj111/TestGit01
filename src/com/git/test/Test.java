package com.git.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<>();
		personList.add(new Person(1, "A", 80));
		personList.add(new Person(2, "B", 90));
		personList.add(new Person(3, "C", 100));
		System.out.println(personList);
		System.out.println("ABCABCABC");
		System.out.println("Test---");
	}
}
