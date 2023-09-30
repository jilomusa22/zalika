package OOPConcetpTwo;

public class TestCar {

	public static void main(String[] args) {
		System.out.println("The below is called static polymophism or compile time polymorphism=method overriding");
		// Static polymophism or compile time polymorphism=One to many=method overriding
		// Honda=Child class can inherit properties from parent + its own properties
		Honda f = new Honda();
		f.start();
		f.speed();
		f.stoped();
		f.reverse();
		f.park();
		f.CloseCarDoor();
		// Parent can access all its properties, but not child class properties.
		Car c = new Car();
		c.start();
		c.speed();
		c.stoped();
		c.reverse();

		System.out.println("The below is called dynamic polymorphism or Runtime Polymorphism");
		// The below is called Top Casting
		Car d = new Honda();// Child class object can be referred by parent class referrence variable---
		d.start(); // This is called dynamic polymorphism or Runtime Polymorphism or Top Casting
		d.speed();
		d.stoped();
		d.reverse();

		Toyota t = new Toyota();

		t.BenLeft();
		t.BenRight();

		// Down Casting
		// Honda h=(Honda) new Car();//ClassCastException
	}

}
