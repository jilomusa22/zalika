package OOPInterfacePlusAbstractionConcept;

public class ProCreditBankSierraLeone implements BankOfSierraLeone, BankOfLiberia {
	// For ProCrdit Bank to inherit the properties Or Methods from BankOfSL and---
	// Liberia Banks---,
	// we use IMPLEMENTS KEYWORD before the class name
	// Point on the highlight under ProCreditBank...and add Unimplemented Methods
	// ---
	// That will bring all the methods from the parent interface sections.

	public static void main(String[] args) {

	}

	@Override // Overriden method
	public void debitFacility() {
		System.out.println("debitFacility---from---BankOfSL");

	}

	@Override
	public void creditFacility() {
		System.out.println("CreditFacility---From---BankOfSL");

	}

	@Override
	public void transferAmountFacility() {
		System.out.println("transferAmountFacility---From---BankOfSL");

	}

	@Override
	public void DesabilityLoan() {
		System.out.println("DesabilityLoan---From---BankOfLib");

	}

	@Override
	public void childCareLoan() {
		System.out.println("childCareLoan---From---BankOfLib");

	}

	@Override
	public void disasterLoan() {
		System.out.println("disasterLoan---From---BankOfLib");

	}

	// ProCreditBank own Method

	public void seniorLoan() {

		System.out.println("SeniorLoan from ProCredit Bank Sierra Leone");
	}

	// ProCreditBank own Method
	public void insurance() {

		System.out.println("Insurance from ProCredit Bank Sierra Leone");
	}

}
