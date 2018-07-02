package com.example.DataStructure;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String args[]) {
	      // Create a hash map
	      Hashtable balance = new Hashtable();
	      Enumeration names;
	      String str;
	      double bal;

	      balance.put("Zara", new Double(3434.34));
	      balance.put("Mahnaz", new Double(123.22));
	      balance.put("Ayan", new Double(1378.00));
	      balance.put("Daisy", new Double(99.22));
	      balance.put("Qadir", new Double(-19.08));

	      // Show all balances in hash table.
	     
	      names= balance.keys();
	      
	      while (names.hasMoreElements())
	      {
	    	  str=(String)names.nextElement();
	    	  System.out.println(str+" "+ balance.get(str));
	      }
	      System.out.println();
	      
	      
	      bal=((Double)balance.get("Zara")).doubleValue();
	      balance.put("Zara", new Double(bal+2000));
	      System.out.println("Zara new balance "+balance.get("Zara"));
	      
	      bal=((Double)balance.get("Mahnaz")).doubleValue();
	      
	      balance.put("Mahnaz", new Double(bal+250));
	      
	      System.out.println("Mahnaz new value are "+balance.get("Mahnaz"));
	   }

}