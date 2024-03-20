package javaBasic;

public abstract class Human {
	
	
String name;
	
	public Human(String name) {  // constructor
		this.name = name;
	}
	public Human() { // constructor
		
	}
	
	//there can be abstract and concrete methods in the abstract class. If the method has its implementation
	//then the method is concrete otherwise it is abstract.
	
	public void eat() { // concrete method
		System.out.println("The human being eats something....");
	}
	
	public abstract void walk(); //abstract method - without implementation
	
	public abstract void learn();

}
