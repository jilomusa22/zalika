package OOPConceptOne;

public class FunctionsOne {

	public static void main(String[] args) {
		// Functions and Method are same
		// copy of all non-static methods will be given to the new object
        // Why main method is void, because we never write return statement inside the main method
		FunctionsOne ob = new FunctionsOne();
		ob.test();// To call non-static method, we use
		System.out.println(ob.A());// OR
		int y = ob.A();
		System.out.println(y);

		System.out.println("ggggggggggggggggggggggggggggggggggggg");

		System.out.println(ob.B());// OR
		String c = ob.B();
		System.out.println(c);

		int f = ob.division(10, 5);// OR
		System.out.println(ob.division(10, 5));
		System.out.println(f);

		int z = ob.Multiplication(17, 12, 22);
		System.out.println(z);//OR
		System.out.println(ob.Multiplication(17, 12, 22));

		double d = ob.Addition(30.8, 20.2);
		System.out.println(d);//OR
		System.out.println(ob.Addition(30.8, 20.2));
	}
	// NON-STATIC METHODS(Has non-static keywords)
	// void---does not return anything

	//// RETURN TYPE =void
	public void test() {// No input, and no output
	//	System.out.println("Test Method");

	}

	// RETURN TYPE =int
	public int A() {// No input some aoutput

	//System.out.println("A method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	// Return type is String
	public String B() {// No input some output
//		System.out.println("B method");
		String x = "Selenium";
		return x;
	}
	// Return type is integer

	public int division(int x, int y) {// has input(input parameters/arguments), and output
	//	System.out.println("Division Method");

		int p = x / y;
		return p;
	}

	public int Multiplication(int a, int b, int j) {

	//	System.out.println("This is Multiplication Method");

		int t = a * b * j;
		return t;
	}

	public double Addition(double h, double v) {

//		System.out.println("Addition Method");
		double n = h + v;
		return n;

	}

}
