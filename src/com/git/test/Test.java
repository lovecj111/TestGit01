package com.git.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<>();
		personList.add(new Person(1, "A"));
		personList.add(new Person(2, "B"));
		personList.add(new Person(3, "C"));
		System.out.println(personList);
		System.out.println("ABCABCABC");
		System.out.println("Test---");
	}
}
