package FinalClassTest;

public class ChildClassFinal extends ParentClassForFinal {// Remove final modifier from parent
	
	         // Final is used to define constant values or Values than can not change
			// To prevent inheritance, we use final.
			// To prevent method overiding
	public void start() {
		
		System.out.println("Child class----start method");
	}

	public static void main(String[] args) {
		
		ParentClassForFinal r1= new ParentClassForFinal();
		
		r1.start();

	}

}
