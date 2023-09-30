package ArrayListConcept;
public class ArrayConceptOne {
// One Dymentional Array is called static array
	public static void main(String[] args) {
		// 1.Static Array, size is fixed....Stores only similar data types...
		//To solve these problems, we use Object array,
		// Collections, ArrayList, HashTable, Dynamic Array
		// 2. Stores only similar data types...To solve these problems, we use Object
		// array
		int i[] = new int[4];
	//	int []i = new int[4]; OR

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[0]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		// System.out.println(i[4]);//java.lang.ArrayIndexOutOfBoundsException

		System.out.println("The size or length of array is:" + i.length);// length / size of the array
		// print all values of array

		for (int z = 0; z < i.length; z++) {

			System.out.println(i[z]);
		}
		System.out.println("****************double Array*************");

		double s[] = new double[3];

		s[0] = 12.01;
		s[1] = 13.02;
		s[2] = 14.91;
		for (int p = 0; p < s.length; p++) {

			System.out.println(s[p]);
		}
		// Object Array--Used to store different data type like String, Integer,
		// Character, Double---
		Object jt[] = new Object[4];

		jt[0] = "Tom";
		jt[1] = 20;
		jt[2] = 21.22;
		jt[3] = 'M';

		for (int u = 0; u < jt.length; u++) {

			System.out.println(jt[u]);

		}
	}

}
