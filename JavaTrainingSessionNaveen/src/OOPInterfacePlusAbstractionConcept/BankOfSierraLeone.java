package OOPInterfacePlusAbstractionConcept;

public interface BankOfSierraLeone {
// The below methods are called ABSTRACT METHODS=Have no method body
	public void debitFacility();

	public void creditFacility();

	public void transferAmountFacility();
	
	int minimum_bal=200;// Interface Variable are static in nature
	// We can have only Abstract Method In Interface.
	// No Method Body,
	// Only Method Declaration
	// No static method are allowed, but interface variables are static in nature by default
	// We have 100% Abstraction
	// Can not ctreate the object of interface
	// Only final and static variables we can define here
	// Interface is Used when we want to hide complete business logic as opposed to
	// Abstract Class(Partial business logic)
}
