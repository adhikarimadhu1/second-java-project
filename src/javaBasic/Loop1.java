package javaBasic;

public class Loop1 {

	public static void main(String[] args) {

		for (int i = 5; i <= 7; i++) {
			System.out.println("Inside the nested loop");
			for (int j = 10; j <= 13; j++)

				System.out.println(j);
		}

		int cellNum[] = { 10, 40, 55, 34, 11, 43 };
		System.out.println(cellNum[1]);

		
		for (int i = 2; i < cellNum.length; i+= 2) {
			System.out.println(cellNum[i]);
		}

		
		for (int variableName : cellNum) {
			System.out.println(variableName);


			String name = "This is my name";

			String[] names = name.split(" ");
			for (int i = 0; i < names.length; i++) {
				if (names[i].equals("my")) {
					System.out.println(names[i]);
					break;
				}
			}

		}
	}

}
