package com.example.Java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstStream {

	
	
	public static void main(String[] args) {
		
		Stream.of("Radenko","Milka","Albert","Simon","Aasin")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
		IntStream
		.range(1, 10)
		.skip(3)
		.forEach(y-> System.out.println(y));
		
		
		
		String[] niz = {"Radenko","Milka","Slavko","Simo","Simon"};
		
		Arrays.stream(niz)
		.filter(x-> x.startsWith("S"))
		.forEach(x-> System.out.println(x));
		//System.out.println();
	}
}
