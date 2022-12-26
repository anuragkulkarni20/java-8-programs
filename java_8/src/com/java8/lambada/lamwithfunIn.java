package com.java8.lambada;



@FunctionalInterface
interface Cabd{
	 
	public void bookCab();
}

// step2 : create class which implemnets interface
// for implemmtning thiis interface we have to create one more class whic
// implents cab interface

/*
 * class Uber implements Cabd{ // inside the class we have to write method
 * implemtation
 */	
	
	//step 3 :
	/*
	 * public void bookCab() { // method implemntion part.
	 * 
	 * System.out.println("uber cab is booked"); }
	 * 
	 * // ()->System.out.println("uber cab is booked"); //this lamdba expersion we
	 * have to wright infront obj
	 * 
	 * }
	 */



public class lamwithfunIn {
	
	public static void main(String[] args) {
		
		//step4: to invok implemnt class create obj.
		
		// create obj of uber
		//Uber cab = new Uber();
//	Cabd cab = new Uber();	// both tym we get the same result instead of using ola cab we use parent inerface.
		
	//by removing obje i,e new uber directly wirght
	//()->System.out.println("uber cab is booked");
	// now remove entire class uber ,one lambd  statment do all work, i.e below.	
		
		
	Cabd cab =()->System.out.println("uber cab is booked");
		
	
	
	cab.bookCab();
		
		
 		
	}

	
	

}
