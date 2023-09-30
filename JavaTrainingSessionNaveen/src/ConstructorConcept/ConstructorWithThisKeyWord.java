package ConstructorConcept;

public class ConstructorWithThisKeyWord {// This KeyWord is used to initilize Global Variable/Class Variables
	
	//Global Variable/Class Variables
	String name;
	int age;
	
	public ConstructorWithThisKeyWord(String name, int age) {
		
		this.name=name;
		this.age=age;
	
		System.out.println(name);
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
	 ConstructorWithThisKeyWord y=new ConstructorWithThisKeyWord("Sao", 200);
		
		
	}
	
    

}
