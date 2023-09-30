package OOPConcetpTwo;

public class Honda extends Car {// Has -a- Relationship

	public static void main(String[] args) {

	}

	// when method in parent class and child class have the same name with same # of arguments=Method-Overriding
	// This is inheritance=Method-Overriding
	public void start() {// Preference will be given to the overridden method(child method)

		System.out.println("Honda Started");
	}

	public void park() {
		System.out.println("Honda Parked");

	}
	public void CloseCarDoor() {
		System.out.println("Closs Honda-- Door");

	}
}
