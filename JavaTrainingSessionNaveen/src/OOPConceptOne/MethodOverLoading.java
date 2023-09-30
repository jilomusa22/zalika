package OOPConceptOne;

public class MethodOverLoading {
// Same method names but different input parameters in the same class =Method Over Loading
	public static void main(String[] args) {
		MethodOverLoading obj=new MethodOverLoading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(30, 70);		
	}
	
	public void sum(){// Zero input parameter
		
		System.out.println("This is Sum Method---Zero imput");
			
	}
     public void sum(int x) {// One input parameter
    	 
    	 System.out.println("Second Method----One Input Parameter");
    	 System.out.println(x);
    	 
     }
     
     public void sum(int x, int y) {// Two input parameters
    	 
    	 
    	 System.out.println("Third Method-----Two Input Prameter");
    	 System.out.println(x+y);
     }
}
