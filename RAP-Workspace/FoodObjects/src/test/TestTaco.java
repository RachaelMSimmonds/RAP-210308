package test;

import model.Taco;

public class TestTaco {
	public static void main(String[] args) {
		Taco bell; 
		//initialized our bell reference variable
		//by instantiating our Taco class
		//to instantiate a class you create an object from that class. 
		bell = new Taco("beef", "flour", 1.00); 
		
		bell.setFlavor("veggies");
		bell.setCost(2.00);
		
		System.out.println("Bell: flavor="+bell.getFlavor()
				+" tortilla="+bell.getTortilla()+" cost ="+bell.getCost());
		
		Taco a = new Taco();
		
		
		Double b = 2.0;
		Float anotherVariable = 9.0f; 
	}
}
