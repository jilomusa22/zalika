package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListNow {// Collection(ArrayList Object is part of collection)=Dynamic Array
	// ArrayList can contain duplicate values
	// Maintains insection order
	// Not Synchronized, hence slow in nature as compare to ther collections
	// Allows random access to fetch elements, ie it stores values on the order of indexes

	public static void main(String[] args) {

		int a[] = new int[3];// This is called static Array, and it is fixed in nature

		ArrayList ar = new ArrayList();// Non-Generic ArrayList Object
		ar.add(100);// 0 position
		ar.add(200);// 1 position
		ar.add(300);// 2 Position
		ar.add(400);// 3 Position
		ar.add(600);

		System.out.println(ar.size());// Size/ Length of array List
		
		System.out.println("Size, 111111111111111111111111111111111111");

		ar.add(500);
		ar.add(600);

		System.out.println(ar.size());
		System.out.println("Size, 2222222222222222222222222222222222222");

		ar.add("Yei");
		ar.add(23.09);
		ar.add('M');
		ar.remove(0);

		System.out.println(ar.size());
		System.out.println("Size,333333333333333333333333333333333333333");

		System.out.println(ar.get(3));// To get value of an index
		System.out.println("Size,gettttttttttttttttttttttttttttttttttttt");

		// To Print all values of ArrayList, use for loop

		for (int j = 0; j < ar.size(); j++) {

			System.out.println(ar.get(j));

		}
		// To enter only integer values in the ArrayList=Generic ArrayList

		ArrayList<Integer> r = new ArrayList<Integer>();// Generic ArrayList Object

		r.add(100);
		r.add(200);
		r.remove(0);// To remeove from the ArrayList
		// r.add("Tom");
		// To enter only String values in the ArrayList
		ArrayList<String> r1 = new ArrayList<String>();

		r1.add("Mattu");
		r1.add("Jiloh");

		// Employee Class Objects
		Employee e1 = new Employee("Karim", "QA Dpt", 32);
		Employee e2 = new Employee("Sesay", "English Dpt", 40);
		Employee e3 = new Employee("Walimatu", "QA Dpt", 69);

		// Create ArrayList

		ArrayList<Employee> e4 = new ArrayList<Employee>();// Non-Generic

		e4.add(e1);
		e4.add(e2);
		e4.add(e3);

		// Iterator to tranverse the ArrayList Values

		Iterator<Employee> u = e4.iterator();

		while (u.hasNext()) {

			Employee u1 = u.next();

			System.out.println(u1.name);
			System.out.println(u1.Dept);
			System.out.println(u1.age);
			// Collection part2
		}

		// AddAll()
		ArrayList<String> y = new ArrayList<String>();
		y.add("Hello");
		y.add("Mr.");
		y.add("Ali");

		ArrayList<String> z = new ArrayList<String>();

		z.add("Where");
		z.add("is");
		z.add("Tom?");

		y.addAll(z);

		for (int k = 0; k < y.size(); k++) {

			System.out.println(y.get(k));

		}
  System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		// RemoveALL()

		y.removeAll(z);

		for (int k = 0; k < y.size(); k++) {

			System.out.println(y.get(k));

		}
	System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");	
		//RetainAll()// Common Values to be printed
		ArrayList<String> y1 = new ArrayList<String>();
		y1.add("Hello");
		y1.add("Mr.");
		y1.add("Ali");
		
		ArrayList<String> y2 = new ArrayList<String>();
		y2.add("Hello");
		y2.add("Mr.");
		y2.add("John");
		
		y1.retainAll(y2);
		
		for (int j = 0; j < y1.size(); j++) {

			System.out.println(y1.get(j));

		}

	}

}
