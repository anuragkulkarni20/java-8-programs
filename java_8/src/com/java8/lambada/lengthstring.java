
package com.java8.lambada;

/* Write a program to check the length of string is greater than 4 or 
 * not
 *  use lambda exprssion*/

// step1: import java.util.function package
import java.util.function.Predicate;

 

public class lengthstring {
	

	
	public static void main(String[] args) {
		
// step2: write prediate function using  string parameter		

		Predicate<String> pr=s->(s.length()>4);
		
		// pass the value using test method present in predicate fun
		System.out.println(pr.test("Anurag"));// true for greater than 4
		
		
		
		
	}
	
}
