package Abstractions_Concept01_AbstractClass;

public class ChaseBank extends BankLoan {

	@Override
	void interestRate() {
		System.out.println("ChaseBank offfers 6.0% Interest Rate");
		
	}

	@Override
	void priceMatch() {
		System.out.println("ChaseBank bank doesn't offer price match with lower interest rate");
	}

}
