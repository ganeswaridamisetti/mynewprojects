package com.oops.shallowdeep.copy;
class Employee{
	int eid;
	String ename;
	Department department;
	public Employee(int eid, String ename, Department department) {
		this.eid = eid;
		this.ename = ename;
		this.department = department;
	}
	public Employee(Employee emp) {
		this.eid =emp. eid;
		this.ename = emp.ename;
		this.department =new Department (emp.department);//creating new object 
	}
}
class Department{
	String name;

	public Department(String name) {
		this.name = name;
	}
	Department(Department department){
		this.name=department.name;
	}
}

public class Deepcopy {

	public static void main(String[] args) {
		Department d=new Department("java");
		Employee emp1=new Employee(1,"sri",d);
		System.out.println("employee id: "+emp1.eid);
		System.out.println("employee name :"+emp1.ename);
		System.out.println("department name :"+emp1.department.name);
		System.out.println("***************************************");
		Employee emp2=new Employee(emp1);
		System.out.println("employee id: "+emp2.eid);
		System.out.println("employee name :"+emp2.ename);
		System.out.println("department name :"+emp2.department.name);
		System.out.println("***************************************");
		emp2.ename="srikanth";
		emp2.department.name="vcube";
		System.out.println("employee id: "+emp2.eid);
		System.out.println("employee name :"+emp2.ename);
		System.out.println("department name :"+emp2.department.name);
		System.out.println("***************************************");
		System.out.println("employee id: "+emp1.eid);
		System.out.println("employee name :"+emp1.ename);
		System.out.println("department name :"+emp1.department.name);
		System.out.println("***************************************");
	}

}
