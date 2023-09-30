package EvenNumberConcept;

public class EvenNumber {

	public static void main(String[] args) {
		// for even
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		// for odd
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
