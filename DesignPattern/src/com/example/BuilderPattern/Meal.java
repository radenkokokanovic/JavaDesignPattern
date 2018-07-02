package com.example.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Iteam> items=new ArrayList<Iteam>();
	
	public void  addItem(Iteam item) {
		items.add(item);
		
	}
	
	public float getCost() {
		float cost=0.0f;
		for (Iteam item: items)
		{
			cost+=item.price();
		}
		return cost;
	}
	
	public void showIteams() {
		for (Iteam item:items)
		{
			System.out.println(item.name());
			System.out.println(item.packing().pack());
			System.out.println(item.price());
		}
	}
}
