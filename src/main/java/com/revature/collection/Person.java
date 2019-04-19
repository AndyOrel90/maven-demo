package com.revature.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}
	
	public static void main(String[] args) {
		TreeSet<Person> people = new TreeSet<>();
		people.add(new Person("bob", 55));
		people.add(new Person("moe", 3));
		people.add(new Person("shawn", -4));
		
		for (Person p : people) {
			System.out.println(p.name + ", " + p.age);
		}
		
		// Using Comparator
		TreeSet<Person> peopleByName = new TreeSet<>(new PersonNameComparator());
		peopleByName.addAll(people);
		
		for (Person p : peopleByName) {
			System.out.println(p.name + ", " + p.age);
		}
		
		// Using Anonymous Comparator Class
		TreeSet<Person> peopleByReverseName = new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o2.name.compareTo(o1.name);
			}
		});
		
		for (Person p : peopleByReverseName) {
			System.out.println(p.name + ", " + p.age);
		}
		
		// Using Lambda Comparator
		TreeSet<Person> peopleByReverseAge = new TreeSet<>((o1, o2) -> o1.age - o2.age);
		
		for (Person p : peopleByReverseAge) {
			System.out.println(p.name + ", " + p.age);
		}
	}
}

class PersonNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
