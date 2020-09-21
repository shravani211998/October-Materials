package com.hsbc;

import java.util.Scanner;

/*
 * This class is for demo purpose
 */
public class HelloApp {
	
	/*
	 * main method to test our application
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Number = "+number);
		System.out.println("Enter a word");
		String word = sc.nextLine();
		System.out.println("Word = "+word);
		System.out.println("Enter a boolean");
		boolean isAvaiable = sc.nextBoolean();
		System.out.println("Is Available = "+isAvaiable);
		sc.close();
	}
}

