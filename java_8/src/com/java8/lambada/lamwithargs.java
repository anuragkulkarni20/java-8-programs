package com.java8.lambada;

interface Cabe{
	
	public String bookCabe(String source, String destinantion);
	
}


/*
 * class Uberz implements Cabe{
 * 
 * 
 * public String bookCabe(String source, String destinantion) {
 * System.out.println("Uberz is booked from :" + source + " to " +
 * destinantion);
 * 
 * return ("price:400 rs");
 * 
 * }
 * 
 * 
 * 
 * }
 */
public class lamwithargs {

	public static void main(String[] args) {
		
		
//		Cabe  obj = new Uberz();
		
	Cabe obj = (String source, String destinantion)-> {
		System.out.println("Uberz is booked from :" + source + " to " + destinantion);
		
		return ("price:400 rs");
		
	};
		
	//obj.bookCabe("hyd", "pune");
		System.out.println(obj.bookCabe("hyd", "pune"));
		

		//return ("price:400 rs");
		
		
	}
	
	
	
	
}
