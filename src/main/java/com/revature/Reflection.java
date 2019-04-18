package com.revature;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

class Person {
	public String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
	}

	public void birthday() {
		System.out.println("Happy Birthday!");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class Reflection {
	public static void main(String[] args) throws ClassNotFoundException {
		Person bob = new Person("Bob", 55);
		
		// Introspection
		System.out.println(bob.getClass().getName());
		System.out.println(Arrays.toString(bob.getClass().getDeclaredFields()));
		
		// Invocation
		Method m;
		try {
			m = bob.getClass().getMethod("birthday", new Class<?>[0]);
			m.invoke(bob);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Modification
		Class<?> c = Class.forName("com.revature.Person");
		try {
			Person joe = new Person("Joe", 5);
			Field f = c.getDeclaredField("age");
			f.setAccessible(true);
			f.set(joe, -1000);
			System.out.println(joe);
		} catch (NoSuchFieldException | SecurityException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
