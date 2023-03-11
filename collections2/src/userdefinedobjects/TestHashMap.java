package userdefinedobjects;


import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		
		
		Employee emp1 =new Employee("John Doe","Male",24,101,"research",40000);
		Employee emp2 =new Employee("Jonas Doe","Male",29,102,"research",30000);	
		Employee emp3 =new Employee("John Doe","Male",23,103,"accounting",46000);		
		Employee emp4 =new Employee("John Doe","Male",18,104,"Savings",87000);		
		Employee emp5 =new Employee("John Doe","Male",70,105,"SALES",90000);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		HashSet<Employee> empSet = new HashSet<Employee>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		TreeSet<Employee> empTreeSet = new TreeSet<Employee>();
		empTreeSet.add(emp1);
		empTreeSet.add(emp2);
		empTreeSet.add(emp3);
		empTreeSet.add(emp4);
		empTreeSet.add(emp5);
		
		HashMap<String,Collection> dataMap = new HashMap<>();
		dataMap.put("emplist", empList);
		dataMap.put("empSet",empSet);
		dataMap.put("empTreeSet",empTreeSet);
		System.out.println(dataMap);
		
		Collection<Employee> list = dataMap.get("empList");
		Iterator<Employee> iter = list.iterator();
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
		Collection<Employee> set = dataMap.get("empSet");
		iter = set.iterator();
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
		Collection<Employee> tree = dataMap.get("empTreeSet");
		iter = tree.iterator();
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
		

	}

}
