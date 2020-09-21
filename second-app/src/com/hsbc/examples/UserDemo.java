package com.hsbc.examples;

public class UserDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("Alexandar", "alex123", "Male", 5555, 25000, "Manager");
		System.out.println(e1);
		Employee e2 = new Employee("Bruce", "bruce123", "Male", 5566, 35000, "Developer");
		System.out.println(e2);
		User u1 = new User("Raj", "raj123", "Male");
		System.out.println(u1);
		User u2 = new User("Jennifer", "jenni123", "Female");
		System.out.println(u2);
	}

}
