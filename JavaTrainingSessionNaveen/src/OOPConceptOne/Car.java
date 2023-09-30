package OOPConceptOne;

public class Car {
	
	//Global Variable=Class Variables
	int mod;
	int wheel;

	public static void main(String[] args) {
		//new keyword is used to create an object, eg  Car a =new Car();
		//a, b, c---are object reference variables
		
		Car a =new Car();
		Car b =new Car();
		Car c =new Car();
		
		a.mod=2012;
		a.wheel=4;
		
		b.mod=2013;
		b.wheel=4;
		
		c.mod=2014;
		c.wheel=4;
	
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);

	}

}
