package userdefinedobjects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;



public class TestEmpTreeSet {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> empTreeSet = new ArrayList<Employee>();
		
		Employee emp1 =new Employee("John Doe","Male",24,101,"research",40000);
		Employee emp2 =new Employee("Jonas Doe","Male",29,102,"research",30000);	
		Employee emp3 =new Employee("John Doe","Male",23,103,"accounting",46000);		
		Employee emp4 =new Employee("John Doe","Male",18,104,"Savings",87000);		
		Employee emp5 =new Employee("John Doe","Male",70,105,"SALES",90000);
		
		
		empTreeSet.add(emp1);
		empTreeSet.add(emp2);
		empTreeSet.add(emp3);
		empTreeSet.add(emp4);
		empTreeSet.add(emp5);
		
		System.out.println(empTreeSet);
	
	}

}
