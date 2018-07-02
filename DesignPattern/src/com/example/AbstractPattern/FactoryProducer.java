package com.example.AbstractPattern;

public class FactoryProducer {
	
	public static AbstractFactory getFacotry(String choice) {
		
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactroy();
		}else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}

}
