// Write a java Linkdlist Programm Take One Employee Class and add Creat list 

package CFP;

import java.util.LinkedList;

public class Employee {

	int id ;
	String name;
	String department ;
	int salary;
	
	public Employee ( int id, String name, String department, int salary)
	{
		this.id = id ;
		this.name = name ; 
		this.department = department ;
		this.salary = salary ;
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee (30,"Atul","production",15000);
		Employee e2= new Employee (23,"Vishal","It",30000);
		Employee e3 = new Employee (28,"Prathmesh" , "Electrical", 23000); 
		
		LinkedList<Employee> employee = new LinkedList<>();
		
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		
		for(Employee e : employee)
		{
			System.out.print(e.id);
			System.out.print(e.name);
			System.out.print(e.department);
			System.out.print(e.salary);
		}
		
	}

}
