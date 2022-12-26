package com.java8.lambada;

import java.util.function.Function;

//multipication of two number using lmdba functional





public class funintmultitwonum {
	
	public static void main(String[] args) {
		// function <data type of passing value , d.t of return type>
		Function<Integer,Integer> f=n->n*n;
		
		System.out.println(f.apply(5));
		System.out.println(f.apply(12));	
		System.out.println(f.apply(10));
	}

}
