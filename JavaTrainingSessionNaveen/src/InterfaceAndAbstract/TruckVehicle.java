package InterfaceAndAbstract;

public interface TruckVehicle {
	
	    // We can have only Abstract Method In Interface.
		// No Method Body,
		// Only Method Declaration
		// We have 100% Abstraction
		//Can not ctreate the object of interface
		//Only final and static variables we can define here
		//Interface is Used when we want to hide complete business logic as opposed to Abstract Class(Partial business logic)
		
		int  wheels=4;
		
		
		public void openDoor();

		public void startTrcuk();

		public void moveTruck();

		public void speedTruck();

		void startTruck();

}
