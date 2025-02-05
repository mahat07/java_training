package com.celcom.day2;

class Employee {
		int eid;
		String ename;
		double esalary;
		
		Employee(int id, String name,double salary){
			eid=id;
			ename=name;
			esalary=salary;
		}
		
		void display() {
			System.out.println("Employee id: "+eid);
			System.out.println("Employee name: "+ename);
			System.out.println("Employee salary: "+esalary);
		}

}


public class ClassAndObjectEx1{
	public static void main(String[] args) {
		Employee Mahathi = new Employee(101,"Mahathi",20000);
		Mahathi.display();
	}
	
}






