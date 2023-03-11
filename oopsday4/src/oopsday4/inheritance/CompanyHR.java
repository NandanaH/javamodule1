package oopsday4.inheritance;

public class CompanyHR {

	public static void main(String[] args) {
		
		Employee emp1 =new Employee("John Doe","Male",24,101,"research",40000);
		System.out.println(emp1);
		
		Employee emp2 =new Employee("Jonas Doe","Male",29,102,"research",30000);
		System.out.println(emp2);
		
		Employee emp3 =new Employee("John Doe","Male",23,103,"accounting",46000);
		System.out.println(emp3);
		
		Employee emp4 =new Employee("John Doe","Male",18,104,"Savings",87000);
		System.out.println(emp4);
		
		Employee emp5 =new Employee("John Doe","Male",70,105,"SALES",90000);
		System.out.println(emp5);

	


	
	if(emp1.equals (emp5)) {
		System.out.println("the objects are same");
	}
	else
	{
		System.out.println("the objects are not different");
	}
}
}