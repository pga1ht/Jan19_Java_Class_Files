package ch6;

public class Employee6 {
	private String firstName;
	private String lastName;
	private float salary;
	private int empId;
	private Title title;
	
	static float minWage = 15.00f;
	static int retireAge = 65;
	
	
	
	
	public Employee6(String fname, String lname, Title t) {
		setFirstName(fname);
		setLastName(lname);
		setTitle(t
				
				);
	}
	
	public Employee6() {
		this("J.", "Doe", Title.DEV);
	}
	
	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
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
		return "Employee6 [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", empId="
				+ empId + ", title=" + title + "]";
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
		Employee6 other = (Employee6) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
		
	

}
