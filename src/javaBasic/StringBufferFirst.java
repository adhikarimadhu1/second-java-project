package javaBasic;

public class StringBufferFirst {
	public static void main(String[] args) {

		String name = "shova";
		System.out.println("using for loop...");
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println(name.charAt(i));

			System.out.println("using inbuilt buffermethod....");
			StringBuffer str = new StringBuffer(name);
			System.out.println(str.reverse());

			int num = 8;
			String afterConversion = String.valueOf(num);
			System.out.println(afterConversion);

			int num2 = 12546;
			String afterConversion2 = String.valueOf(num2);
			StringBuffer Str = new StringBuffer(afterConversion2);
			System.out.println(Str.reverse());

		}

	}

}
