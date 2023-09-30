package OOPConceptOne;

public class LocalVsGlobalVariables {
	//These are Global Variables or Class variables
	
	String name="Tamba";
	int age =400;

	public static void main(String[] args) {
        // Local variables should be accessed by creating the object of a class
		LocalVsGlobalVariables jt= new LocalVsGlobalVariables();
		
		System.out.println(jt.name);
		System.out.println(jt.age);	
		
		int p=10;//Local variable for main method
		System.out.println(p);
		
		int e=34;// Local variable for main method
		System.out.println(e);
		
			
		jt.sum();
		
		System.out.println(jt.sum());
		
		
	//	int s=jt.sum();// accessing non-static method
	//	System.out.println(s);
		
	}
	
//	public void sum() {
//		int p=12;//Local variable from sum method
//		int q=10;
//		
		public int sum() {
			int p=12;//Local variable from sum method
			int q=10;
			int x=p+q;
			return x;	
	}

}
