package com.example.BuilderPattern;

public abstract class Burger implements Iteam{

	
	@Override
	public Packing packing() {
		
		return new Wrapper();
	}
	
	public abstract float price();
	

}
