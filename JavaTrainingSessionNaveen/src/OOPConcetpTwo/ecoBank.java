package OOPConcetpTwo;

public class ecoBank implements AfricaBank,USABank{// Multiple inheritance OR Is-a relationship

public static void main(String[] args) {

}

public void credit() {
	
	System.out.println("ecobank---Credit");

}

public void debit() {//Overriding from AfricaBank
	
	System.out.println("ecobank---Credit");

}

public void transferAmount() {//Overriding from AfricaBank

System.out.println("ecobank---Credit");

}

public void carLoan() {// Own Method implemented
	
	System.out.println("Ecobank Car Loans");
}

public void OverDraft() {// Overriding from USABank
	
	System.out.println("USA Bank OverDraft");

}

public void MobileDeposit() {// Overiding from USA Bank
	
	System.out.println("USA  Bank---MobileDeposit");
	
}

}
