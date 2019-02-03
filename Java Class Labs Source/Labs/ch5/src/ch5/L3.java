package ch5;

public class L3 {
	
	public static void main(String[] args) {
		Employee3 Emp1 = new Employee3();
		Emp1.empId = 01;
		Emp1.firstName = "Alex";
		Emp1.lastName = "Hellstrom";
		Emp1.salary = 100000f;
	
		//System.out.println("ID = " + Emp1.empId);	
		
		Emp1.showEmp();
	}
	
}
