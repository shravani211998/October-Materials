package com.hsbc.collection;

import java.util.Comparator;

public class SortStudentByRollNo implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getRollNo() - o1.getRollNo(); // 5 - 4 = +ve, 4 - 5 = -ve
	}

}
