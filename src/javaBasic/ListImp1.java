package javaBasic;

import java.util.ArrayList;

public class ListImp1 {
	public static void main(String[]args) {
		
		ArrayList<String>arrayList = new ArrayList<>();
		arrayList.add("Hari");
		arrayList.add("Sita");
		arrayList.add("Shova");
		System.out.println(arrayList);
		for(String str : arrayList ) {
			System.out.println(str);
		}
		
		arrayList.add(2, "dinesh");
		for(String str2 : arrayList) {
			System.out.println(str2);
			System.out.println(arrayList.size());
			System.out.println(arrayList.equals(2));
			
		}
		System.out.println();
		
		
		arrayList.clear();
		System.out.println(arrayList);
		
		
	}

}
