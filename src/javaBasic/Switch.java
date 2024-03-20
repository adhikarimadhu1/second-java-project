package javaBasic;

public class Switch {

	public static void main(String[] args) {

		String name = "Madhu";
		switch (name) {
		case "chet":
			System.out.println("chet is printed");
			break;
		case "ram":
			System.out.println("ram is printed");
			break;
		case "sita":
			System.out.println("sita is printed");
			break;
		case "Madhu":
			System.out.println("madhu is printed");
			break;
		case "lalit":
			System.out.println("lalit is printed");
		default:
			System.out.println("default value");

		}
	}

}
