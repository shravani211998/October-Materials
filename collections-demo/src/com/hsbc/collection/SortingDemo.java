package com.hsbc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(5, "Zaheer", "A"));
		list.add(new Student(3, "Charles", "B"));
		list.add(new Student(4, "Bruce", "C"));
		list.add(new Student(2, "Edward", "A"));
		list.add(new Student(1, "David", "B"));
		for(Student s : list) {System.out.println(s);}
		Collections.sort(list); // this uses compareTo method of Student class 
		System.out.println("---- after sorting ----");
		for(Student s : list) {System.out.println(s);}
		System.out.println("--- after sorting ---");
		// another overloaded sort method, takes comparator object as a second parameter
		Collections.sort(list, new SortStudentByRollNo());
		for(Student s : list) {System.out.println(s);}
		System.out.println("--- sort by name ---");
		// another overloaded sort method, takes comparator object as a second parameter
		Collections.sort(list, new SortStudentByNameAscending());
		for(Student s : list) {System.out.println(s);}
		
	}

}
