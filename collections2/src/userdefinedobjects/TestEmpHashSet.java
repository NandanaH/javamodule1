package userdefinedobjects;

import java.util.ArrayList;
import java.util.Iterator;



public class TestEmpHashSet {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> empSet = new ArrayList<Employee>();
		
		Employee emp1 =new Employee("John Doe","Male",24,101,"research",40000);
		Employee emp2 =new Employee("Jonas Doe","Male",29,102,"research",30000);	
		Employee emp3 =new Employee("John Doe","Male",23,103,"accounting",46000);		
		Employee emp4 =new Employee("John Doe","Male",18,104,"Savings",87000);		
		Employee emp5 =new Employee("John Doe","Male",70,105,"SALES",90000);
		
		
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		System.out.println(empSet);
	
	}

}
