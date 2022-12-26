package com.java8.lambada;
// Write a program to chcek wheter the given number is greater than or not using lambda predicate fumctional interface

import java.util.Scanner;
import java.util.function.Predicate;

public class predicatefun {
	
	public static void main(String[] args) {
		
	

	Predicate<Integer> p=i->(i>=10);
	
	
	System.out.println("enetr a number");
	Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	// passing the value using test method.
	System.out.println("greater num = true ");
	System.out.println(" num less = false");
	
	System.out.println (p.test(a));
	
	System.out.println(p.test(5));
	
}

	
}