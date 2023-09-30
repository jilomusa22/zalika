package OOPConceptOne;

public class StaticAndNonStatic {

	String name = "Jiloh";// Non-Static global vatriable
	static int age = 32;// Static global variable

	public static void main(String[] args) {
		// Calling Static method and variables in java
		//////////////////////////////////////////////
		// Static Methods, can be called directly
		sum();
		// Static Methods can be called, using class name as well,
		StaticAndNonStatic.sum();

		// Static Variable, can be called directly
		System.out.println(age);
		// Static Variable can be called, using Class Name, as well
		System.out.println(StaticAndNonStatic.age);

		// Calling Non-Static method and variables
		StaticAndNonStatic jk = new StaticAndNonStatic();
		jk.sendMail();
		System.out.println(jk.name);

// Can we access static methods by using object reference? YES, but you will see  warning
		jk.sum();

	}

	public void sendMail() {// non-static method

		System.out.println("Mail will be sent");

	}

	public static void sum() {// static method

		System.out.println("This is sum method");
	}
}
