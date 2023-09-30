package InterfaceAndAbstract;

public class TestBank {

	public static void main(String[] args) {
Rokel bk=new Rokel();// We Created Object of ChildClass In The Test Main Method
		
		bk.Credit();
		bk.Debit();
		bk.loan();// Overiding Method
		bk.TransfareFunds();
		
		BankSL b=new Rokel();//This is Dynamic Polymorphism---
		// Child Class Object is referencing Bank Abstract Class Reference Variable
		
		b.Credit();
		b.Debit();
		b.loan();
	//	b.TransfareFunds();Can not be called here

	}

}
