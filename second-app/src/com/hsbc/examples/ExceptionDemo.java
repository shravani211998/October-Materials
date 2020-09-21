package com.hsbc.examples;

import java.util.Scanner;

// Checked Exception
class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		super("Sorry balance is insufficient");
	}
	public InsufficientBalanceException(String m) {
		super(m);
	}
}
// Unchecked Exception
class SimpleException extends RuntimeException {
	
}
public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to divide");
		int x = sc.nextInt();
		int y = sc.nextInt();
		try {
			operation(x, y);
		} catch(ArithmeticException e) {
			System.out.println("Exception1: "+e.getMessage());
		}
		System.out.println("Enter amount to withdraw:");
		double amount = sc.nextDouble();
		try {
			withdraw(amount);
		} catch (InsufficientBalanceException e) {
			System.out.println("Exception2: "+e.getMessage());
		} finally {
			System.out.println("Finally is executed");
		}
		System.out.println("Program exits normally!");
	}
	
	public static void operation(int x, int y) {
		if(y == 0) {
			throw new ArithmeticException("Input is 0 to divide");
		}
	}
	public static void withdraw(double amount) throws InsufficientBalanceException {
		double balance = 5000;
		if(amount > balance) 
			throw new InsufficientBalanceException("Balance is insufficient for the amount "+amount+", balance is "+balance); // message = null;
		else
		{
			System.out.println("Amount debited");
			balance = balance - amount;
			System.out.println("Balance is: "+balance);
		}
	}

}
