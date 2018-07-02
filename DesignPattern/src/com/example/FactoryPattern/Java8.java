package com.example.FactoryPattern;

public class Java8{

	
	final static String salutation = "Hello! ";
	   
	   public static void main(String args[]) {
	      GreetingService greetService1 = message -> 
	      System.out.println(salutation + message);
	      greetService1.sayMessage("Radenko");
	   }
		
	   interface GreetingService {
	      void sayMessage(String message);
	   }
}
