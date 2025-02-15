package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	String ename;
	int eid;
	int esalary;
	Employee(String ename, int eid, int esalary) {
		this.ename = ename;
		this.eid = eid;
		this.esalary = esalary;
	}
	public String getEname() {
		return ename;
	}
	public int getEid() {
		return eid;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", esalary=" + esalary + "]";
	}
	
}

public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee m = new Employee("Mahathi",5,15000);
		//file output stream object to write contents
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Inamanamelluri_V\\ObjectFile.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(m);
		objout.close();
		fout.close();
		System.out.println("object saved");
		//implement serializable interface to eliminate NotSerializableException
		//deserialization implementation
		FileInputStream fin = new FileInputStream("C:\\Users\\Inamanamelluri_V\\ObjectFile.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee emp = (Employee) objin.readObject(); // reading the same object we created before
		objin.close();
		fin.close();
		System.out.println(emp);
		
	}

}
