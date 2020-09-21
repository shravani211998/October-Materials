package com.hsbc.examples;

public class Employee extends User {
	private int id;
	private double salary;
	private String designation;
	public Employee(String name, String password, String gender, int id, double salary, String designation) {
		super(name, password, gender);
		this.id = id;
		this.salary = salary;
		this.designation = designation;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String password, String gender) {
		super(name, password, gender);
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", designation=" + designation + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
