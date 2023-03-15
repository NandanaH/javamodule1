package oopsday4.composition;

public class Employee extends Person {
	
	private long empid;
	private String deptno;
	private double salary;
	private Address residenceAddress;
	private Address correspondenceAddress;
	
	public Employee() {
		
	}

	public Address getResidenceAddress() {
		return residenceAddress;
	}

	public void setResidenceAddress(Address residenceAddress) {
		this.residenceAddress = residenceAddress;
	}

	public Address getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	public void setCorrespondenceAddress(Address correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	public Employee(String name, String gender, int age, long empid,String deptno,double salary,Address residenceAddress, Address correspondenceAddress) {
		super(name, gender, age);
		this.empid = empid;
		this.deptno = deptno;
		this.salary = salary;
		this.residenceAddress = residenceAddress;
		this.correspondenceAddress = correspondenceAddress;
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
		return "Employee [residenceAddress=" + residenceAddress + ", correspondenceAddress=" + correspondenceAddress
				+ "]";
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
		

   }
}
