package OOPConcetpTwo;

public class TestBankInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	AfricaBank b= new AfricaBank();
		
		System.out.println(AfricaBank.min_bal);
		ecoBank e= new ecoBank();
		e.credit();
		e.debit();
		e.transferAmount();
		e.carLoan();
		System.out.println("xxxxxxxxxxxxxxxxxxxxx");
		//Dynamic Polymorphism
		//Child class object can be referred by parent interface reference
		AfricaBank b=new ecoBank();
		b.credit();
		b.debit();
		b.transferAmount();
	
		
		

	}

}
