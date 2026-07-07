package com.oops.shallowdeep.copy;

class Department1 {
    String name;

    Department1(String name) {
        this.name = name;
    }
}

class Employee1 implements Cloneable {
    int eid;
    String ename;
    Department1 department;

    Employee1(int eid, String ename, Department1 department) {
        this.eid = eid;
        this.ename = ename;
        this.department = department;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow Copy
    }
}


public class Shallowcopy {
    public static void main(String[] args) throws CloneNotSupportedException {

    	Department1 d=new Department1("java");
		Employee1 emp1=new Employee1(1,"sri",d);
		System.out.println("employee id: "+emp1.eid);
		System.out.println("employee name :"+emp1.ename);
		System.out.println("department name :"+emp1.department.name);
		System.out.println("***************************************");
		Employee1 emp2 = (Employee1) emp1.clone();

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