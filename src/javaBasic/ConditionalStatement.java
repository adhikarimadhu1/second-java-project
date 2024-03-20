package javaBasic;

public class ConditionalStatement {

	public static void main(String[] args) {

		int myNum = 10;

		int mySecondNum = 2;

		int modulus = myNum % mySecondNum;

		System.out.println(modulus);

		
		
		if (myNum == 10) {
			System.out.println("My number is matching");
		} else {
			System.out.println("My number is not matching");
		}
		
		
		int userName = 3241;
		if (userName > 10000) {
			if (userName == 3242) {
				System.out.println("1. The user is able to log in");
			} else {
				System.out.println("2. The user is not able to log in");
			}
		} else {
			System.out.println("3. The user not able to log in");
		}
		
		
		String name = "Kishwor";
		if (name == "Madhu") {
			System.out.println("my name is Madhu");
		} else if (name == "John") {
			System.out.println("my name is John");
		} else if (name == "Kishwor") {
			System.out.println("my name is Kishwor");
		} else {
			System.out.println("My name is not here");
		}

	}

}
