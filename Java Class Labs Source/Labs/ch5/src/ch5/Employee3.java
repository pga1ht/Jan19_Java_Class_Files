package ch5;

public class Employee3 {
	public String firstName;
	public String lastName;
	public float salary;
	public int empId;
	public static float minWage = 15.00f;
	public static int retireAge = 65;
	
	
	public void showEmp() {
		System.out.println("ID = " + empId);
		System.out.println("Name = " + firstName + " " + lastName);
		System.out.println("Salary = " + salary);
		System.out.println("Miniumum Wage = " + minWage);
		System.out.println("Retirement Age = " + retireAge);
		
	}	

}
