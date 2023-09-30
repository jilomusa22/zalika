package BasicJavaTwo;

public class IfElseComparison {

	public static void main(String[] args) {

		int a = 10;

		int b = 20;

		if (a > b) {

			System.out.println("Not true");

		}

		else {

			System.out.println("Yes it is true");
		}
		// comparison operator
		// < > <= >= == !=

		int n1 = 100;
		int n2 = 200;
		// int n3 =300;

		if (n1 == n2) {

			System.out.println("We all go to school");

		} else {

			System.out.println("They all go to school");
		}

		int n = 400;
		int m = 200;
		int o = 300;

		if (n > m & n > o) {

			System.out.println("n is the greatest");

		} else if (m > o) {

			System.out.println("m is the greatest");

		} else {

			System.out.println("O is the greatest");

		}
	}

}
