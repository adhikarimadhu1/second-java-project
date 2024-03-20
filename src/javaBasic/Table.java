package javaBasic;

public class Table extends Furniture  {
	int numOFLegs = 4;
	  public void dinner() {
		  System.out.println("the table is for eat dinner");
	  }
	
	public static void main(String[]args) {
		Table table = new Table();
		System.out.println(table.numOFLegs);
		table.decorate();
		System.out.println(table.location);
		
	}

}
