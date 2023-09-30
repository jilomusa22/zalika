package Finally;

public class FinallyConcept {

	public static void main(String[] args) {
		// Finally is always associated with try and catch bock
		testone(); // It will be executed whether there is exception or not.
		test2();
		divid();

	}

	public static void testone() {
		try {

			System.out.println("Inside testone---method");

			throw new RuntimeException("testone");
		} catch (Exception e) {

			System.out.println("Inside catch block");

		}

		finally {

			System.out.println("Inside finally block");
		}
	}

	public static void test2() {

		try {

			System.out.println("Test2 Method");
		}

		finally {

			System.out.println("Test2 Finally Method");
		}

	}

	public static void divid() {

		int s = 10;

		try {

			int t = s / 0;

			System.out.println("Inside Divid try block");
		}
		// catch(NullPointerException e) //java.lang.ArithmeticException
		catch (ArithmeticException e) {
			System.out.println("Inside divid catch block");

		} finally {

			System.out.println("Inside divid finally block");
		}

	}
}
