package com.example.DataStructure;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExFirst {
	
	private static String REGEX = "radenko";
	   private static String INPUT = "The radenko says meow. " + "All radenko say meow.";
	   private static String REPLACE = "slavko";
	   
	   private static String RegEx="test";
	   private static String Input="moj primjer test";
	   private static String replace="programa";
	   
	   

	   public static void main(String[] args) {
	      Pattern p = Pattern.compile(REGEX);
	      
	      // get a matcher object
	      Matcher m = p.matcher(INPUT); 
	      INPUT = m.replaceAll(REPLACE);
	      System.out.println(INPUT);
	      
	      
	      // get a matcher object
	      
	      Pattern p1=Pattern.compile(RegEx);
	      Matcher m1=p1.matcher(Input);
	      Input=m1.replaceAll(replace);
	      
	      System.out.println(Input);
	   }

}
