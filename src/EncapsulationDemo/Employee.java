package EncapsulationDemo;

public class Employee {
	private String name;

	//get the value of private method, using getter method
	//String as return type is String
	public String getName() {
		return name;
	}
	
	//setter method
	public void setName(String n) {
		name =n;
	}

}
