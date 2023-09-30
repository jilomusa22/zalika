package CanWeOverLoadMainMethod;

public class CanWeOverLoadMainMtd {

	public static void main(String[] args) {
		// Can we OverLoad Main Method?---Yes We can
		System.out.println("Main Method---1");
		
		
		// We are calling Methods now
		main("2---Main Method with String Argument");
		main(45);
		main(30, 12);

	}

	public static void main(String args) {

		System.out.println("Main Method With no Paramer---2");

	}

	public static void main(int a) {

		System.out.println("Main Method With single Parameter---3");

	}

	public static void main(int a, int b) {

		System.out.println("Main Method With Two Parameters---4");

	}

}
