package Finalize;

public class FinalizeConcept {// Just for cleanup processing of the object in Java Memory
	
	public void finalize() {
		
		System.out.println("Finalize method");
	}

	public static void main(String[] args) {
		
		FinalizeConcept f1 =new FinalizeConcept();
		FinalizeConcept f2 =new FinalizeConcept();
		
		f1 =null;
		f2=null;
		
		System.gc();
		
		        //Final is a keyword
				//Finally is a block
				//Finalize is a method

	}

}
