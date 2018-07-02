package com.example.AbstractPattern;

public class AbstractFactoryPatternDemo {

	
	public static void main(String[] args) {
		
		//get shapeFactory
		AbstractFactory shapeFactory=FactoryProducer.getFacotry("SHAPE");
		
		Shape shape1=shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		
		Shape shape2=shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3=shapeFactory.getShape("Square");
		shape3.draw();
		
	}
}
