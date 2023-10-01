package ExceptionHandlingConcept;

public class ThrowKeyWard {

	public static void main(String[] args) {

		// Throw is used when you want to throw your own exception delebrately
		// Throw should be handled by try-catch block not with throws declaration sent
		// to the main method
		// It is not normally used by Develpers

		System.out.println("Sannoh Exception Handled");
		try {

			throw new Exception("Sannoh Exception");
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("Print After");

		String Country_Flag = "Non_Green";

		if (Country_Flag.equals("Non_Green")) {

			try {

				throw new Exception("Country Flag Exception");
			} catch (Exception e) {

				e.printStackTrace();
				System.out.println(e.getMessage());
			}

		}

	}

}
