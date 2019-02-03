package ch6;

public class Employee3 {
	private String firstName;
	private String lastName;
	private float salary;
	private int empId;
	
	static float minWage = 15.00f;
	static int retireAge = 65;
	
	
	
	
	public Employee3(String fname, String lname) {
		setFirstName(fname);
		setLastName(lname);
	}
	
	public Employee3() {
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

	@Override
	public String toString() {
		return "Employee1 [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", empId="
				+ empId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee3 other = (Employee3) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
		
	

}
