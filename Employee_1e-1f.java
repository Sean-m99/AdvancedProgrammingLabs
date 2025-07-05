abstract class Person {
	String name;
}

class Employee extends Person implements Payable {
	// static field
	private static int numOfEmployees = 0;
	// instance fields
	private int ID;
	private double salary;
	private String department;

	// constructor
	public Employee(String n, double s, String d) {
		this.name = n;
		this.salary = s;
		this.department = d;
		numOfEmployees++;
		this.ID = numOfEmployees;
	}

	// static method
	public static int getIDcount() {
		return numOfEmployees;
	}
	// methods
	public void editName(String newName) {
		this.name = newName;
	}
	public double getSalary() {
		return this.salary;
	}
	public double calcPaymentAmount() {
		return this.salary;
	}
}

class Manager extends Employee {
	private double bonus;

	public Manager(String n, double s, String d, double b) {
		super(n,s,d);
		this.bonus = b;
	}

	public double calcTotalEarnings() {
		return getSalary() + bonus;
	}
}

class Invoice implements Payable {
	double value;
	String description;
	public double calcPaymentAmount() {
		return this.value;
	}
}

interface Payable {
	public double calcPaymentAmount();
}