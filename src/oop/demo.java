package oop;

 
 class Person {
	 
	 String name;  
	 String email;
	 String phone;
	 
	 void walk() {
		 System.out.println(name + " is walking");
	 }
	 
	 void eat() {
		 System.out.println(email);
	 }
	 
	 void sleep() {
		 System.out.println(name + " is sleeping");
	 }
 }
 

public class demo {
 
	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "joe@temail.com";
		person1.phone = "582537363";
		
		//Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
	
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.email = "sarah@tegmail.com";
		person2.phone = "989373628";
		
		person2.walk();
	    person2.sleep();
	    person2.eat();
	    
		
	    /*
		// Person
=		
		// Attributes, variable, adjective, descriptors
		String name = "Joe";
		String email = "joe@temail.com";
		String numbers = "7853845282";
		
		// Action, activity, behavior
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		// What if we wanted to do this for another person?
		
		String name2 = "Sarah";
		String email2 = "Sarah@temail.com";
		String numbers2 = "9892426234";
		
		// Action, activity, behavior
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
		
		// What about binding attributes and properties together?
	}

	//  Enhance by adding function to minimize the code
	static void walking(String name) {
	System.out.println(name + " is walking");
	     */
	}
}
