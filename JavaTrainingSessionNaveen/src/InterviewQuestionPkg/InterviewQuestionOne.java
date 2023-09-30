package InterviewQuestionPkg;

public class InterviewQuestionOne {

	public static void main(String[] args) {
		// Pass null argument with method overloading of string and Objects types
		
		
		
		test(null);

	}

	public static void test(Object o) {

		System.out.println("Object");
	}

	public static void test(String o) {

		System.out.println("String");
	}

}
