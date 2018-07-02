package com.example.DataStructure;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegExThird {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s");//. represents single character  
		Matcher m = p.matcher("as");  
		boolean b = m.matches();  
		  
		//2nd way  
		boolean b2=Pattern.compile(".s").matcher("22").matches();  
		  
		//3rd way  
		boolean b3 = Pattern.matches(".s", "assdad22");  
		  
		System.out.println(b+" "+b2+" "+b3);  
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		for (int x: squaresList)
			System.out.println(x);
		
		
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl","","","","");

		//get count of empty string
		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Count je "+count);
		
		Random random = new Random();
		random.ints().limit(2).forEach(System.out::println);
		
		
		List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		//get count of empty string
		int count2 = (int) strings2.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println("Broj paznih polja je "+count2);
		
		
		List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
		
	      System.out.println("List: " +integers);
	      System.out.println("Highest number in List : " + getMax(integers));
	      System.out.println("Lowest number in List : " + getMin(integers));
	      System.out.println("Sum of all numbers : " + getSum(integers));
	      System.out.println("Average of all numbers : " + getAverage(integers));
	      System.out.println("Random Numbers: ");
	}
	 private static int getMax(List<Integer> numbers) {
	      int max = numbers.get(0);
			
	      for(int i = 1;i < numbers.size();i++) {
			
	         Integer number = numbers.get(i);
				
	         if(number.intValue() > max) {
	            max = number.intValue();
	         }
	      }
	      return max;
	   }
		
	   private static int getMin(List<Integer> numbers) {
	      int min = numbers.get(0);
			
	      for(int i= 1;i < numbers.size();i++) {
	         Integer number = numbers.get(i);
			
	         if(number.intValue() < min) {
	            min = number.intValue();
	         }
	      }
	      return min;
	   }
		
	   private static int getSum(List numbers) {
	      int sum = (int)(numbers.get(0));
			
	      for(int i = 1;i < numbers.size();i++) {
	         sum += (int)numbers.get(i);
	      }
	      return sum;
	   }
		
	   private static int getAverage(List<Integer> numbers) {
	      return getSum(numbers) / numbers.size();
	   }
}  
