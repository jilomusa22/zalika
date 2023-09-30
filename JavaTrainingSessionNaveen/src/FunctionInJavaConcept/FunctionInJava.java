package FunctionInJavaConcept;

public class FunctionInJava {

	public static void main(String[] args) {// Main Method is void because we can write any return statements here.
		//That is, it can not return any value
		// Create Object of the class

		FunctionInJava ob = new FunctionInJava();
		ob.test();
		int f = ob.add();
		String t = ob.name();
		int c = ob.div(40, 10);
		System.out.println(c);
		System.out.println(f);
		System.out.println(t);

	}

// the 3 test methods are: method overloading--Same methods asr same with different input parameters
	// One Parameter input
	public void test() {// No input and no output/Void fuction/method

		System.out.println("Test Method, with no Parameter Input");
	}

	// One parameter input
	public void test(int s) {// One input and no output/Void fuction/method

		System.out.println(" Test Method, with one Parameter input.");
	}

	// Two parameter Input
	public void test(int s, int t) {// No input and no output/Void fuction/method

		System.out.println("Test Method, with two Prameter input");
	}

	public int add() {// No input function, but some Output fuction

		System.out.println("Add method-One parameter method/function");

		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	public String name() {// No input function, but some Output fuction

		System.out.println("Name-Fuction returning string values");

		String s = new String();
		s = "My Parents";
		return s;
	}

	// Some input and some Output Values
	public int div(int i, int j) {

		System.out.println("Div-Method with input and out put fuctions");

		int k = i / j;
		return k;
	}

}
