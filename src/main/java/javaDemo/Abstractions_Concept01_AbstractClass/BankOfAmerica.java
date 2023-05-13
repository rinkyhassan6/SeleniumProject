package Abstractions_Concept01_AbstractClass;

public class BankOfAmerica extends BankLoan {

	@Override
	void interestRate() {
		System.out.println("BankOfAmerica offfers 4.5% Interest Rate");
		
	}

	@Override
	void priceMatch() {
		System.out.println("BankOfAmerica do price match with lower interest rate");
		
	}

}
