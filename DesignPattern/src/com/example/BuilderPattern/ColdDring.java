package com.example.BuilderPattern;

public abstract class ColdDring implements Iteam{

	
	@Override
	public Packing packing() {
		
		return new Bottle();
		
	}
	
	public abstract float price();
	
	
}
