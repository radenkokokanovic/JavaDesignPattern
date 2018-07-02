package com.example.BuilderPattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IfStatement {

	
	public static void main(String[] args) {
		
		int x=200;
		int y=20;
		
		//System.out.println(compare(x, y));
		
		
		List<Integer> values=new ArrayList<>();
		values.add(404);
		values.add(908);
		values.add(639);
		values.add(265);
		
		Comparator<Integer> c= (i, j) -> (i % 10>j % 10) ? 1:-1;
					
			
		
		
		Collections.sort(values,c);
		
		
		for(Integer o: values)
		{
			System.out.println(o);
		}
	}
	
	public static int compare(int x,int y)
	{
		return (x<y)? -1 : ((x==y)? 0:1);
	}
}
