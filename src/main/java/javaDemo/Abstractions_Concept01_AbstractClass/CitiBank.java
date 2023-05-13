package Abstractions_Concept01_AbstractClass;

public class CitiBank extends BankLoan {

	@Override
	void interestRate() {
		System.out.println("CitiBank offfers 5.5% Interest Rate");
		
	}

	@Override
	void priceMatch() {
		System.out.println("CitiBank doesn't offer price match with lower interest rate");
	}

}
