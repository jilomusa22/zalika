package BasicJavaTwo;

import java.util.Hashtable;

public class HashTableOne {

	public static void main(String[] args) {
		
		Hashtable t = new Hashtable();
		
		t.put("Tom", "Sesay");// Put is a method
		
		t.put("Hello", "People");
		
		System.out.println(t.size());
		
        t.put(0, 100);
		
		t.put(2, 300);
		
		System.out.println(t.get(0));
		
		t.put(4, "Mohamed");
		// To use Integer only
		
		Hashtable<Integer, Integer> f= new Hashtable<Integer, Integer>();
		
	  //f.put("Tom", "Ali");
		f.put(1, 122);
		
		System.out.println(f.get(1));
		
		Hashtable<Integer, String> f1= new Hashtable<Integer, String>();
		
		f1.put(4, "Alieu");
		
		System.out.println(f1.get(4));

	}

}
