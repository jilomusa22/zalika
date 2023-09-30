package EvenNumberConcept;

public class AddAndOrConcept {

	public static void main(String[] args) {
		// for Add condition
				for(int i = 1; i<=100; i++) {
					if(i%3 == 0 && i%5 == 0) {
						System.out.println(i);
					}
				}
   System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				// for Or condition
				for(int i = 1; i<=100; i++) {
					if(i%3 == 0 || i%5 == 0) {
						System.out.println(i);
					}
				}
	}

}
