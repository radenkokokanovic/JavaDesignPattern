package com.example.DataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {
	
	 public static void main(String args[]) {
	      // Create an array list
	      ArrayList al = new ArrayList();
	      
	      // add elements to the array list
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");

	      // Use iterator to display contents of al
	      System.out.print("Original contents of al: ");
	      Iterator itr = al.iterator();
	      
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();
	      
	      
	      ArrayList<String> lista=new ArrayList<>();
	      
	      lista.add("Radenko");
	      lista.add("Kokanovic");
	      lista.add("Gornje");
	      lista.add("Crnjelovo");
	      
	      Iterator<String> iterator=lista.iterator();
	      
	      while(iterator.hasNext())
	      {
	    	  System.out.println(iterator.next());
	      }
	      
	      ArrayList<Integer> lista2=new ArrayList<>();
	      lista2.add(1);
	      lista2.add(2);
	      lista2.add(3);
	      lista2.add(4);
	      
	      Iterator<Integer> iter=lista2.iterator();
	      
	      while(iter.hasNext())
	      {
	    	  System.out.println(iter.next());
	      }
	      
	      
//	      // Modify objects being iterated
//	      ListIterator litr = al.listIterator();
//	      
//	      while(litr.hasNext()) {
//	         Object element = litr.next();
//	         litr.set(element + "+");
//	      }
//	      System.out.print("Modified contents of al: ");
//	      itr = al.iterator();
//	      
//	      while(itr.hasNext()) {
//	         Object element = itr.next();
//	         System.out.print(element + " ");
//	      }
//	      System.out.println();
//
//	      // Now, display the list backwards
//	      System.out.print("Modified list backwards: ");
//	      
//	      while(litr.hasPrevious()) {
//	         Object element = litr.previous();
//	         System.out.print(element + " ");
//	      }
//	      System.out.println();
	   }

}
