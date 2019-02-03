package ch5;

public class L2 {
	
	public static void main(String[] args) {
		Employee2 Emp1 = new Employee2();
		Emp1.empId = 01;
		Emp1.firstName = "Alex";
		Emp1.lastName = "Hellstrom";
		Emp1.salary = 100000f;
	
		//System.out.println("ID = " + Emp1.empId);	
		
		Emp1.showEmp();
	}
	
}
