package javaBasic;

public class MoneyPlant1 implements Plant1 {

	@Override
	public void grow() {
		System.out.println("the money plants grow...");
		
		
	}

	@Override
	public void purityAir() {
		System.out.println("the moneyplant purify air ....");
		
		
	}

	@Override
	public void takesco2() {
		System.out.println("the moneyplant takes co2...");
		
		
	}
	
public static void main(String[]args) {
	MoneyPlant1 plant = new MoneyPlant1();
	plant.grow();
	plant.purityAir();
	plant.takesco2();
	
}
}
