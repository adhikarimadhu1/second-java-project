package javaBasic;

public class Variable {
	
	boolean isTravel = true; // instance variable
	static double income = 43000.34; // static method
	
	public static void main(String[] args) { // main method
		
		Variable variable = new Variable();
		// object creation. object is created to get the acess of instance value.
		
		// Variable is a container which stores value that can be changed.
		// Variable can be categorized into three parts.
		// 1. local variable-- declared inside method--scope--inside the method
		// 2. instance/global variable-- declared outside the method without static keyword.
		// 3. static/class variable--declared outside the method with static keyword.
		
		int phoneNumber = 571847374; // local variable
		
		System.out.println(phoneNumber);
		System.out.println(variable.isTravel);
		System.out.println(income);
		
		// instance variable can be accessed through object creation.
		// static variable can be acessed without creating object.
				
		
	}
}
