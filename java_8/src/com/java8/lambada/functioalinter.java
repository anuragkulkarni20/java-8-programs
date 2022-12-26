package com.java8.lambada;

// sttep 1.

// create interface 

@FunctionalInterface
interface Cab{
	 
	public void bookCab();
}

// step2 : create class which implemnets interface
// for implemmtning thiis interface we have to create one more class whic
// implents cab interface

class Ola implements Cab{
	// inside the class we have to write method implemtation 
	
	
	//step 3 :
	
	public void bookCab()
	{
		// method implemntion part.
		
		System.out.println("ola cab is booked");
	}
	
	
}

public class functioalinter {

	public static void main(String[] args) {
		
		//step4: to invok implemnt class create obj.
		
		// craete obj of ola 
		//Ola cab = new Ola();
	Cab cab = new Ola();	// both tym we get the same result instead of using ola cab we use parent inerface.
		cab.bookCab();
 		
	}
	
}
