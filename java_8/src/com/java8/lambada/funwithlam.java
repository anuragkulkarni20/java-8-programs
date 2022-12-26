package com.java8.lambada;

// step1; create intseface


interface Cabc{
	
	public void bookCabc(String source, String destination);
}

//
//step 2 create class to implents interface
/*
 * class Zomoto implements Cabc{
 * 
 * public void bookCabc(String source, String destination) {
 * 
 * System.out.println("Cab is booked from  :" + source +"to" + destination );
 * 
 * } }
 */
//step for using lambda experssion directly use lambd expersion .instead of all above class
public class funwithlam {

	
	
	public static void main(String[] args) {
	
//		Cabc cab = new Zomoto();
		//inerfacename obj_variable name = aregument list arrow tokn implemetion
		Cabc obj = (String source, String destination)->System.out.println("Cab is booked from  :" + source +"to" + destination );
		
		obj.bookCabc("Nanded", "Pune");
	
		//cab.bookCabc("Nanded", "Pune");
		
	}
}
