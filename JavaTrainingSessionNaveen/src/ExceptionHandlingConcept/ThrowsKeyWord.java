package ExceptionHandlingConcept;

public class ThrowsKeyWord {

	public static void main(String[] args) {
		// This is used to handle exception
		// No reporting mechanism here
		// Program will be terminated
		
		ThrowsKeyWord u=new ThrowsKeyWord();
		
		u.subs();
		System.out.println("Exeption Handled");

	}
	
	public void subs() {
		try {
			div();
	//Object is the super super class of all the clases
	//Throwable is parent class or is a super class of errors and exceptions
	//	}catch (Throwable e) {
	//	}catch (Exception e) {// Takes care of all exceptions
		}catch (ArithmeticException e) {// Takes care of this specific exception
			
			e.printStackTrace();
			
		}
		
	}
	
	public void div() throws ArithmeticException{
		 int c=4/0;
		
	}

}
