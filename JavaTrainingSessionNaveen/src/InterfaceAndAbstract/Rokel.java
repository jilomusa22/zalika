package InterfaceAndAbstract;

public class Rokel extends BankSL{
	
	// We added extends keyword before ProCrediBank--To make it a child of Bank
		// Loan Method from Bank was defined here in the child class.
		public void loan() {// Note: Any Abstract Method Defined in The Parent Class SHould Be Stated In The Child Class--
			//Else, you will see an error.
			//Loan Abstract Method was declared in the Parent Bank, Hence Should be used here.
			//This in other word is called Method OverLoading
			
			System.out.println("ProCreditBank---Loan Method");
			
		}
		
		public void TransfareFunds() {
			
			System.out.println("ProCreditBank----Transfer Funds");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
