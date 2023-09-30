package InterfaceAndAbstract;

public abstract class  BankSL {
	// We Added abstract keyword before class
		// Abstract method=Only prototype,Only method declaration, No method body.
		// Abstraction = Hiding Implementation Logic-
		// Partia Abstraction=when we want to hide partial business logic, and revail some
		// Anstract Classs Can Have Abstract Method And Non-Abstract Methods aswell.
		// We can not create the object of Asstract Classes
		// Hiding Implementation Logic is=Abstraction(OOP Concept)
		//Abstract classes are faster in execution than interfaces

		int amount = 300;
		final int rate = 10;
		static int loanSum = 40;

		public abstract void loan();// Abstract Method declaration---No method body

		public void Credit() {// Non-Abstract Method--1

			System.out.println("Bank--Credit");
		}

		public void Debit() {// Non-Abstract Method--2

			System.out.println("Bank--Debit");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
