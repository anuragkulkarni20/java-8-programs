package com.java8.lambada;

import java.util.function.Function;

// wap to find lenght of string using predefind function interface using lamda exp



public class stringlngthfun {

	
	public static void main(String[] args) {
		
		Function<String,Integer> fn =s->s.length();
		
		
		// passing the value using .apply method
		
		
		//int b=fn.apply("Anurag"); my innovations
		
		// printing lenght of string .result in ineger
		
		System.out.println(fn.apply("Anurag"));
	
	//System.out.println(b);  // it will give result. remove coomnts int b line .
	}
}
