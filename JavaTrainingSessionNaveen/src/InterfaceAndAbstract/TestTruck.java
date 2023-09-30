package InterfaceAndAbstract;

public class TestTruck {

	public static void main(String[] args) {
  ManDeseal t=  new ManDeseal();
		
		t.openDoor();
		t.startTrcuk();
		t.moveTruck();
		t.speedTruck();
		
		
		TruckVehicle tr=new ManDeseal();// Dinamic Polymorphism
		
		tr.openDoor();
		tr.startTrcuk();
		tr.moveTruck();
		tr.speedTruck();
		

	}

}
