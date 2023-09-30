package BasicJavaTwo;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while loop
		// without increment/decrement, it will generate infinite loop
		System.out.println("*********************WhileLoop*************");
		int i = 1;

		while (i <= 10) {

			System.out.println(i);
			i++;

		}
		System.out.println("***********Forloop***************");
		// for loop
		for (int j = 1; j <= 10; j++) {

			System.out.println("Yes we are okay " + j);

		}
		// print in the reverse
		System.out.println("xxxxxxxxxxxxForLoopxxxxxxxxxxxxxxxx");

		for (int k = 10; k >= 1; k--) {

			System.out.println("We are revering as we print " + k);

		}

		// do while loop
		System.out.println("*******************DoWhileLoop****************");
		int v = 1;

		do {
			System.out.println("It is do while loop " + v);
			v++;

		} while (v < 10);
	}

}
