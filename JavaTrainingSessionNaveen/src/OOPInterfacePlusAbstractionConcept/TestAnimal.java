package OOPInterfacePlusAbstractionConcept;

public class TestAnimal extends Animal{

	public static void main(String[] args) {
		
		
		Animal abs=new TestAnimal();
		abs.eat();
		abs.run();

	}

	@Override
	void eat() {
		System.out.println("From Animal----");
		
	}

}
