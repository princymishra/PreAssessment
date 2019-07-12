package assessment;

import java.util.*;

class Employee{
	private String name;
	private String address;
	private int number;
	
	public void employee(){
		System.out.println("I am an Employee.");
	}
}

class Manager extends Employee{
	private int teamSize;
	
	public void projectStatus(){
		System.out.println("I am the Manager. I check the project status.");
	}
}

class Coder extends Employee{
	private String 	programmingLang;
	void coding(){
		System.out.println("I am a Coder and I love Java language");
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		manager.projectStatus();
		manager.employee();
		
		Coder coder = new Coder();
		coder.coding();
		coder.employee();
	}

}
