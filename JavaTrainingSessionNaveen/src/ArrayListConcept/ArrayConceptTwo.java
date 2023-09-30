package ArrayListConcept;

public class ArrayConceptTwo {

	public static void main(String[] args) {

		String x[][] = new String[3][5];
	//	String [][]x = new String[3][5];  OR

		System.out.println("How many rows are here?:" + x.length);// Total number of roles
		System.out.println("How many columns are here?:" + x[0].length);// Total number of Columns
		System.out.println("***********First Row***********************");
		x[0][0] = "I";
		x[0][1] = "Have";
		x[0][2] = "Beautiful";
		x[0][3] = "300";
		x[0][4] = "Cars";
		
		
		System.out.println("***********Second Row***********************");
		x[1][0] = "You";
		x[1][1] = "Brough";
		x[1][2] = "Many";
		x[1][3] = "401";
		x[1][4] = "Books";
		System.out.println("***********Third Row***********************");
		x[2][0] = "They";
		x[2][1] = "Kept";
		x[2][2] = "Decent";
		x[2][3] = "60";
		x[2][4] = "Jets";

		System.out.println(x[0][1]);
		System.out.println(x[1][2]);
		System.out.println(x[2][3]);
		

		for (int row = 0; row < x.length; row++) {

			for (int col = 0; col < x[0].length; col++) {
				System.out.println(x[row][col]);

			}

		}

	}

}
