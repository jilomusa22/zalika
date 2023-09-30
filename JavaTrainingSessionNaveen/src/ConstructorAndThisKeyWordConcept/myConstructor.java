package ConstructorAndThisKeyWordConcept;

public class myConstructor {
	// Class/Global Vriables
	String name;
	int age;

	public myConstructor() {// This is a zero constructor

		System.out.println("Default Constructor----1");

	}

	public myConstructor(int a) {// This is a one Parameter constructor

		System.out.println("One Parameter Constructor----2");
		System.out.println(a);

	}

	public myConstructor(int i, int f) {// This is Two Parameters constructor

		System.out.println("Two Parameters Constructor----3");
		System.out.println(i + " " + f);

	}

	public myConstructor(String name, int age) {// These are local variables
		// This keyword is used to initialize class variables---this is the main reason for constructor
		// this Class Variable= this Local Variable
		this.name = name;
		this.age = age;

	}

	// The above two constructors are called, constructor overloading
	public static void main(String[] args) {
		// Constructor and class name should be the same
		// Constructor is like a function, but can not return an value---we can not
		// write return statement.
		// We can write constructor methods either above or below the main method---
		// But is advisable to write above the main method

		// We can call Constructor by creating the object of a class

		// Both, below will call the default constructor only

		myConstructor cons = new myConstructor();

		// new myConstructor();

		myConstructor con = new myConstructor(20);
		myConstructor con2 = new myConstructor(20, 50);
		myConstructor con3 = new myConstructor("Alie", 50);// We initialized the global variables

		String s = con3.name;
		System.out.println(s);

		int s1 = con3.age;
		System.out.println(s1);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		// OR
		System.out.println(con3.name);
		System.out.println(con3.age);
	}

}
