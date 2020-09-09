
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Employee employee1 = new Employee();
		 employee1.employeeName = "Jashaus";
		 employee1.employeeNumber = 12;
		 employee1.employeeSalary = 100;
		 employee1.display();
		 
	     Employee employee2 = new Employee();
	     employee2.employeeName = "Usha";
	     employee2.employeeNumber = 23;
	     employee2.employeeSalary = 200;
	     employee2.display();
	     
	     if(employee1.employeeSalary > employee2.employeeSalary) {
	    	 System.out.println(employee1.employeeName  + "getting High Salary");
	    	
	     }else {
	    	 System.out.println(employee2.employeeName  + "getting High Salary");
	     }
	       employee1.employeeName = "J";
           System.out.println("Update Employee1Name:" +employee1.employeeName );
           employee2.employeeName = "K";
           System.out.println("Update Employee2Name:" +employee2.employeeName );


	}

}
