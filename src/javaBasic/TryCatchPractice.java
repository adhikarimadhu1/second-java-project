package javaBasic;

public class TryCatchPractice {
	public static void main(String[]args) {
		
		String name = "Shova";
		
		try {
			int num = 8;
			int num2= 0;
			int division = num/num2;
			System.out.println(division);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("this is after division");
		char[]ch = name.toCharArray();
		for(int i =0;i<name.length();i++) {
			System.out.println(ch[i]);
			
		}
			
		}
	}
	
	


