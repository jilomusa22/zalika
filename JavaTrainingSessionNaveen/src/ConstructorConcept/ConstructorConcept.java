package ConstructorConcept;

public class ConstructorConcept {
	
	public ConstructorConcept() {// Constructor is not a method, it is a class
		// There is always a hidden or default constructor
		
		System.out.println("Default Constructor-----");
	}
	
	// Constructor Overloading, same names but different parameters--ConstructorConcept(int i)--
	//ConstructorConcept(int i, int j)
	//Single Parameter Constructor
    public ConstructorConcept(int i) {// Constructor is not a method, it is a class
		
		System.out.println("Single Parameter Constructor-----");
		System.out.println("The value of i "+i);
	}
    //Two parameter Constructor
   public ConstructorConcept(int i, int j) {// Constructor is not a method, it is a class
		
		System.out.println("Two parameter Constructor-----");
		System.out.println("The value of i "+i);
		System.out.println("The value of j "+j);
	}

	public static void main(String[] args) {
        // Constructor will be called immediately you call the object
		ConstructorConcept v=new ConstructorConcept();
		ConstructorConcept v1=new ConstructorConcept(15);
		ConstructorConcept v2=new ConstructorConcept(10,30);

	}
	
	

}
