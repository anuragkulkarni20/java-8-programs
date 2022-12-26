package com.java8.lambada;

import java.util.ArrayList;
import java.util.function.Predicate;

// wap to find emp of sal is graterer than 50k , exp is gt 3 yr,  print emp name.
// this eg will take on eobject of emplyoee and give result .

//step 1: create class of emp


class Employee{
	
	//// decalre variables
	
	String ename;
	int salary;
	 int experience;
	 
	 
	 //step2: create constructor of emp
	 
	 Employee(String name, int sal, int exp)
	 {
		 
		 ename= name;
		 salary=sal;
		 experience= exp;
		 
		 
	 }
	
}


public class prediempsalexp {

	public static void main(String[] args) {
		//step 3: create object of employee class with parameters of const.
		Employee emp = new  Employee  ("Anurag", 50000, 7);

		
	//	Employee emp = new  Employee  ("satish", 30000, 2); youu cannot multiple object create oject on same meomery location it will give error
		// you hav to use arraylist add method to crate multiple object at same location
		
		
	
		// create lambd experssion of our qustion
		
		
		Predicate<Employee> pr =e->(e.salary>30000 && e.experience>3);
		// && and operator will check both condtion should true thn it will print the result .
		
		
		// pass the emp values of object 
		
		System.out.println(pr.test(emp));
	 
	
		
		
		
		//eg 2:multiple emp  list
		
		// adding multiple objects
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		
		al.add(new Employee ("Satish", 300000,2));
		
		al.add(new Employee ("Ram",670000,6));
		
		
		al.add(new Employee ("Shyam",22000,4));
		
		for (Employee e:al) {
			
			if(pr.test(e)) {
				
				System.out.println(e.ename + "  " + e.salary);
			}
		}
		
		
		
		
	}
	
	
}


