package OOPInterfacePlusAbstractionConcept;

public abstract class Animal {
	// We Added abstract keyword before class
	// Abstract method=Only prototype,Only method declaration, No method body.
	// Abstraction = Hiding Implementation Logic-
	// Partia Abstraction=when we want to hide partial business logic, and revail---
	// some--it could be 0 to 100% Abstraction
	// Anstract Classs Can Have Abstract Method And Non-Abstract Methods aswell.
	// We can not create the object of Asstract Classes
	// Hiding Implementation Logic is=Abstraction(OOP Concept)
	// Abstract classes are faster in execution than interfaces

	String name;
	Long height;
	int age;

	abstract void eat();// Abstract Method

	public void run() {// Non-Abstract Method

		System.out.println("Run Method from Animal Abstract Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
