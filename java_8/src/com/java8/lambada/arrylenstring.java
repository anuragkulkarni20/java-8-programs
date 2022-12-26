package com.java8.lambada;

import java.util.function.Predicate;

// wap to find length of string of array is greater than 4 than print name of it using  lambad predicate function
//
public class arrylenstring {
	
	
	public static void main(String[] args) {
		
		
		// here it will check the length of string is gt 4 and prinnt true or false
		Predicate<String> pr =s->(s.length()>4); 
	     
		
		String names[ ] = {"Anurag","Satish","Mahesh","Sindhu","Prasad","Pramod","anu","bala","ram"};
		
	// using predicate fun it will fount out which name gt 4 or not 
		
		// using loop first read the string elemnts
		
		for(String name:names) 
		{ 
			if (pr.test(name)) 
			{
				
				System.out.println(name);
			}
			
			
		// without using lambdaa  	
			if(name.length()>4) 
			{
				System.out.println(name);
				
			}
		}
	
	
	}

}
