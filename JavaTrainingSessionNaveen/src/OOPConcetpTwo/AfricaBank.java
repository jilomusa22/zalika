package OOPConcetpTwo;

public interface AfricaBank {
	//Only Method declared in Interface
	//No Method Body---Only Method Prototype In interface
	//We can declared variables, and variables are by default static in interface
	//Variable values can not be changed/Constant in nature
	//No Static Method in Interface
	//No main method in interface
	//No object creation in interface
	int min_bal= 500;
	public void credit();//Method Prototype
    public void debit();  //Method Prototype
    public void transferAmount();  //Method Prototype
	 

}
