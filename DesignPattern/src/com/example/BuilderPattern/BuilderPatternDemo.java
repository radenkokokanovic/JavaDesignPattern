package com.example.BuilderPattern;

public class BuilderPatternDemo {

	
	public static void main(String[] args) {
		MealBuilder mealBulder=new MealBuilder();
		
		Meal vegMeal=mealBulder.prepareVegMeal();
		System.out.println("VEG Meal");
		
		vegMeal.showIteams();
		
		System.out.println("Cijena paketa je => "+ vegMeal.getCost());
		
		
		Meal nonVegan=mealBulder.prepareNonVegMeal();
		
		System.out.println("Non VEG meal");
		nonVegan.showIteams();
		
		System.out.println("Cijena paketa nonVegan => "+nonVegan.getCost());
	}
}
