package BasicJavaTwo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOne {//LinkedList =Class

	public static void main(String[] args) {
		
		LinkedList<String>  ss = new LinkedList<String>();
		
		//Add
		ss.add("Hawanatu");//0 index
		ss.add("Umaru");   // 1 index
		ss.add("Suliaman");//2 index
		ss.add("Vandy");// 3 index
		
		//Print
		System.out.println("Contents of LinkedList: "+ss);
		
		// AddFirst
		ss.addFirst("Momoh");
		System.out.println("Add First-Aboveeeeeeeee: "+ss);
		ss.addLast("Jusu");
		System.out.println("Add Last-Aboveeeeeeeeee: "+ss);
		
		System.out.println("After adding first and last values:"+ss);
		
		// Get
		System.out.println(ss.get(0));
		System.out.println("Get 0 index: "+ss);
		System.out.println(ss.get(2));
		System.out.println("Get 2 index: "+ss);
		// Set
		ss.set(0, "Mamie");
		System.out.println(ss.get(0));
	
		
		// Remove first and last element
		ss.removeFirst();
		ss.removeLast();
		
		System.out.println("We removed First and Last Values: ie Momoh and Jusu"+ss);
		ss.remove(2);
		System.out.println("We removed 2 Index(Suliaman):"+ss);
		// printing/Iterating all values of LinkedList
		//Forloop
		
		for(int x=0; x<ss.size();x++) {
			
			System.out.println(ss.get(x));
			
		}
		System.out.println("Using ForLoop--Above:**********************"+ss);	
		//Advanced Forloop
		
		for(String str: ss) {
			System.out.println(str);
			
		}
		
		System.out.println("Using Advanced ForLoop--Above:*************"+ss);
		 // Iterator
		Iterator<String> uu = ss.iterator();
		System.out.println("Using Iterator--Above:***********************"+ss);
		while(uu.hasNext()) {
			
			System.out.println(uu.next());
			
		}
		
		
		System.out.println("Using WhileLoop--Below:**********************"+ss);
		//Using WhileLoop
	   int num=0;
				
	    while(ss.size()>num) {
					
		System.out.println(ss.get(num));
		num++;
			
		}
	
	   
	}

}
