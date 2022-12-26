package com.java8.lambada;

import java.util.function.Predicate;

/* wap to  join predicate,  and or negate method
 * p1 program - check given num is even no.
 * p2- check num is gt 50.
 */

public class joinpredicate {

	
	
	public static void main(String[] args) {
		
		// write array
		
		int a[] = {5,10,120,15,35,45, 123,8, 87,85,90,20,29,30,45,50,65,70,75};
		// given num is even or not in array
		
		Predicate<Integer> p1= i->i%2==0;
		
		
		// given num is gt 50 or not in array
		
		Predicate<Integer> p2=i->i>50;
		
		
		// for reading the array elements use for loop
	/*	System.out.println("the even number and greater than 50 numbers  are");
		for(int n:a) 
		{
			//if(p1.test(n)&&p2.test(n));
			//we can use and function for joining instead of && operator
			
			if(p1.and(p2).test(n))
			{
				System.out.println(n);
			}
		}
		*/
		
		// using or operator either one statement true
	
	
	/*for (int n:a) 
	{
	  
		if (p1.or(p2).test(n)) 
		{
			System.out.println(n);
		}
		
	}
	*/
		
		
		// use ngeate method
		// negate == it will opposite of actual condtion
		//therefore it will print the odd num here cz p1 cond is for even num
		
		for(int n:a)
		{
			
			if(p1.negate().test(n)) 
			{
				System.out.println(n);
			}
		}
		
	}
}
