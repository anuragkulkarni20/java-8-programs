package com.java8.lambada;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
// consumer function is one of the pre defined function interface of lambda function
// wap to add into arraylist list emp name salary , findout if bonus is greater 5k 
// then shw emp details 


//step1:create class of employee


class Emplyoeee
{
	
	//step 2  decalre variables
	
	
	String ename;
	
	//String gender;
	
	int salary;
	
	
	// 3.create constructor
	Emplyoeee(String ename,  int salary)
	{
		
		this.ename=ename;
	//	this.gender=gender;
		this.salary=salary;
		
		
		
	}
	
}

//4. now write in main class

public class Consumerfun {
	
	//5. write main method
	public static void main(String[] args) {
		
		//6. create arraylist  
		
		ArrayList<Emplyoeee> emplist = new ArrayList<Emplyoeee>();
		
		// 7.create obj and add deatils into it 
		
		
		emplist.add(new Emplyoeee("Anurag",50000));
		
		
		emplist.add(new Emplyoeee("satish",40000));
	
		
		emplist.add(new Emplyoeee("Prakash",25000));
		
		emplist.add(new Emplyoeee("Akshay",60000));
		
		emplist.add(new Emplyoeee("Raj",20000));
		
		
	
	Function<Emplyoeee, Integer> fn=e->{
		
		int sal=e.salary;
		if(sal>=10000 && sal<=20000)
			return(sal *10/100);
		else if(sal>20000 && sal<=30000)
			return(sal *20/100);
		
		else if(sal>30000 && sal<=50000)
			return(sal *30/100);
		
		else
			return(sal *40/100);
	};
	
	// if bonus 5000 thn it will p
	Predicate<Integer> p =b->b>5000;
	
	//  for reading the all emplist 
	
	for (Emplyoeee emp:emplist) 
	{
		
	int bonus =	fn.apply(emp);
	
	if (p.test(bonus))
	{
		
		System.out.println(emp.ename + "  " + emp.salary);

	System.out.println("bonus is " + bonus);
	}
	}
	
	
	}

}
