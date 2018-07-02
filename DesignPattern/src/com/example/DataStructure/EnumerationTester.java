package com.example.DataStructure;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTester {

	
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public static void main(String args[]) {
		    @SuppressWarnings("rawtypes")
			Enumeration days;
		      Vector dayNames = new Vector();
		      
		      dayNames.add("Radenko");
		      dayNames.add("Slavko");
		      dayNames.add("Tuesday");
		      dayNames.add("Wednesday");
		      dayNames.add("Thursday");
		      dayNames.add("Friday");
		      dayNames.add("Saturday");
//		      days = dayNames.elements();
//		      
//		      while (days.hasMoreElements()) {
//		         System.out.println(days.nextElement()); 
//		      }
		      
		      days=dayNames.elements();
		      
		      while (days.hasMoreElements())
		      {
		    	  System.out.println(days.nextElement());
		      }
		   }
}
