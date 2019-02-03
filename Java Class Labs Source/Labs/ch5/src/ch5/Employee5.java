package ch5;

public class Employee5 {
	private String firstName;
	private String lastName;
	private float salary;
	private int empId;
	
	static float minWage = 15.00f;
	static int retireAge = 65;
	
	
	
	
	public Employee5(String fname, String lname) {
		setFirstName(fname);
		setLastName(lname);
	}
	
	public Employee5() {
		this("J.", "Doe");
	}
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public void showEmp() {
		System.out.println("ID = " + empId);
		System.out.println("Name = " + firstName + " " + lastName);
		System.out.println("Salary = " + salary);
		System.out.println("Miniumum Wage = " + minWage);
		System.out.println("Retirement Age = " + retireAge);
		
	}
		

}
