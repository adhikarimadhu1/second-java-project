package javaBasic;

public class StringImp1 {
	public static void main(String[] args) {

		String name = "hari";
		// reverse
		for (int i = name.length() - 1; i <= 0; i--) {
			System.out.println(name.charAt(i));

			System.out.println("..............");
			StringBuffer str = new StringBuffer(name);
			System.out.println(str.reverse());
			// convert string to int
			String num = "2463";
			int num2 = Integer.valueOf(num);
			System.out.println(num2);
			// convert int to String
			int num1 = 1234;
			String strConvert = String.valueOf(num1);
			StringBuilder strbuilder = new StringBuilder(strConvert);
			System.out.println(strbuilder.reverse());

			String myName = " This is my name ";
			int count = 0;
			System.out.println("With space - " + myName.length());
			for (int i1 = 0; i < myName.length(); i++) {
				if (myName.charAt(i) != ' ') {
					count++;
				}
			}
			System.out.println("Without space - " + count);

			String replace = "4sgse@shd$";
			String isBlank = " ";
			String teacher1 = "Madam";
			String teacher2 = "";
			for (int i1 = teacher1.length() - 1; i1 >= 0; i1--) {
				teacher2 = teacher2 + teacher1.charAt(i1);
			}
			System.out.println(teacher2);
			if (teacher1.equalsIgnoreCase(teacher2)) {
				System.out.println("Palindrome");
			} else {
				System.out.println("No palindrome");
			}

			System.out.println(teacher1.contains("am"));
			System.out.println(teacher1.endsWith("a"));
			System.out.println(teacher1.indexOf("d"));
			System.out.println(isBlank.isBlank());
			System.out.println(isBlank.isEmpty());
			System.out.println(teacher1.replace("d", "c"));
			System.out.println(replace.replaceAll("[^0-9a-zA-Z]", ""));

		}

	}

}
