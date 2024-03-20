package javaBasic;

public class MethodOverloadingExp {
	// polymorphism is a technique of defining a function in a different way.
	// 1. Method Overloading/compile time polymorphis
	// 2. method overriding/ runtime run polymorphis
	// method overloading is a way defining same function in a different way
	// while using method overloading
	// 1. number of parameters(number of parameter should be differnt)
	// 2. data type of parameter should be different
	// 3. sequence of parameters should be different
	public void learn(String num, int num1) {
		System.out.println("The is from the first function");

	}

	public void Teach() {
		System.out.println("this is not a overloading method");
	}

	public void learn(int num1, String num) {
		System.out.println("this is from the second function");
	}

	public void learn(int num) {
		System.out.println("this is from the third function");

	}

	public void learn() {
		System.out.println("this is from fourth function");
	}

	public void learn(String name) {
		System.out.println("this is from fifth function");
	}

	public static void main(String[]args) {
	
	MethodOverloadingExp methodOverloadingExp = new MethodOverloadingExp();
	
	methodOverloadingExp .learn("somthing");
}

}
