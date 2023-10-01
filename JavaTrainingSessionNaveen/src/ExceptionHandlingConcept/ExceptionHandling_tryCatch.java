package ExceptionHandlingConcept;

public class ExceptionHandling_tryCatch {
	
//	int c=20;

	public static void main(String[] args) {

		// Uncaught exception

		//int i = 10 / 0;
		

		//System.out.println(i);// java.lang.ArithmeticException

		// Caught exception
		//Thread.sleep(5000);// This will provide you suggestion how to handle it.
		
	//	ExceptionHandling ex= new ExceptionHandling();
		//java.lang.NullPointerException
	//	ex=null;
	//	System.out.println(ex.c);
		
		// TYPES OF EXCEPTION:
		//1. Try-Catch Block
		
		try{
			int i=2/0;// This code will throw an exception
			// Progtram will be terminated if not handled
		}
		catch(ArithmeticException e) {
			// reporting mechanism
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("Arithmetic Exception");
		
	}

}
