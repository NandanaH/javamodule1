package userdefinedobjects;

public class Employee extends Person implements Comparable {
	
	private long empid;
	private String deptno;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String gender, int age, long empid,String deptno,double salary) {
		super(name, gender, age);
		this.empid = empid;
		this.deptno = deptno;
		this.salary = salary;
	}

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", deptno=" + deptno + ", salary=" + salary + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee ref = null;
		if(obj != null)
			ref=(Employee) obj;
		if(ref.getEmpid() == this.empid &&
		   ref.getName().equals(this.getName()) &&
		   ref.getDeptno()== this.deptno)
		{
			return true;
		}
		else
		{
			return false;
		}
		// TODO Auto-generated method stub
		//return super.equals(obj);
	}

	@Override
	public int compareTo(Object o) {
		
		Employee ref = null;
		if(o != null) {
			ref = (Employee) o;
		}
		if(this.empid < ref.getEmpid())
			return 1;
		else if(this.empid > ref.getEmpid())
			
			return -1;
		else
			return 0;
	}

}
