package com.java8.lambada;


@FunctionalInterface
interface Y
{
	
	void show();
//	int add();
	
}


class Z  implements Y
{
	public void show ()
	{
	System.out.println("hi , from class z impments y");
	}
 
public class firstegwithoutlmda {

	
	public void static main(String[] args) {
		
	//	A obj = new A(); // it will giev error cz we cannot create objcet of interface
		
	
		
	
		Y obj =new Z();
		
		obj.show();
		
	}
}
}
