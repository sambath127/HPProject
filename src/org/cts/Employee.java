package org.cts;

public class Employee {
	static Employee e ;
	private Employee() {	
	}
public static Employee add() {
	if(e==null)
	{
	e= new Employee();
	}
	//System.out.println(System.identityHashCode(e));
	return e;
}
public void empId() {
	System.out.println("Emp id is 76543");
}
public void empName() {
	System.out.println("Emp name is greens");
}
public static void main(String[] args) {
	Employee e = add();
	e.empId();
	e.empName();
	System.out.println(e.hashCode());
}
}
