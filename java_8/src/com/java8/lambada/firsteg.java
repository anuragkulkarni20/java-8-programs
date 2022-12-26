package com.java8.lambada;



// interface must declare out side of the class, here interface a is declard out side of class

// interface has only one (abstract) metthod  is known as functional interface


// we can define object class methods into a interface eg tostring() 
//cz every class in java extends object class ,and tostring() is metthod of object class

@FunctionalInterface
interface A{
	
	
	void show();
	String toString();
	
}




public class firsteg {

	
	
	
	
	public static void main(String[] args) {
		
		/*
		 * // this syntax till we use java 7,
		 *  A obj = new A() {
		 * 
		 * public void show() {
		 * 
		 * System.out.println("hi im inner class i.e annonymous clas "); } };

		 */
		
		// java 8 ==
		// -> = lamda expersiion , for single line statment no need to use curly barckets
		// for multiplle line "{};" use this
				
		A obj = () ->System.out.println(" hi im using lamdba");
		obj.show();
	}
	
}
