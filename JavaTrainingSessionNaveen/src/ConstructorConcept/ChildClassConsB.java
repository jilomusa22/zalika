package ConstructorConcept;

public class ChildClassConsB extends ParentClassConsA {

	public ChildClassConsB() {

		// super(400);// Super keyWard is used to call parent class constructor, else
		// default constructor will be called.
		// Super keyword should be called in the child class only.
		super(400, 500);
		System.out.println("ChildClassConstructor B---");
	}

	public static void main(String[] args) {

		ChildClassConsB d = new ChildClassConsB();

	}

}
