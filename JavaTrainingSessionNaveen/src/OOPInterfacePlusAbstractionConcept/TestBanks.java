package OOPInterfacePlusAbstractionConcept;

public class TestBanks {

	public static void main(String[] args) {

		// BankOfSierraLeone bk=new BankOfSierraLeone(); we can not create object of an
		// interface.
		

		ProCreditBankSierraLeone pc = new ProCreditBankSierraLeone();// We can create object of a class
		System.out.println("xxxxxxxxxxx--BankOfSierraLeone-----xxxxxxxxxxxx");
		pc.debitFacility();
		pc.creditFacility();
		pc.transferAmountFacility();
		System.out.println("fffffffffffffffff--BankOfLiberia-----ffffffffff");
		pc.DesabilityLoan();
		pc.disasterLoan();
		pc.childCareLoan();
		pc.insurance();
		pc.seniorLoan();
		
		//Static variable can be called by interface name
		
		System.out.println(BankOfSierraLeone.minimum_bal);
		// Interface Reference Variable of BankOfSierraLeone (referencing)= child class object
		// We can call only methods from BankOfSierraLeone Interface
		System.out.println("uuuuuuuuuu-------uuuuuuuuuuuuuuu");
		BankOfSierraLeone bl=new ProCreditBankSierraLeone();
		bl.creditFacility();
		bl.debitFacility();
		bl.transferAmountFacility();
		

	}

}
