package Abstractions_Concept01_AbstractClass;

public class Test_AbstractClass {

	public static void main(String[] args) {

		//reference variable of super class
		//BankLoan bl = new BankLoan();
		BankLoan bl;

		bl = new BankOfAmerica();
		bl.homeloan() ;
		bl.interestRate();
		bl.priceMatch();
		System.out.println("-------------------------------");	

		bl = new CitiBank();
		bl.interestRate();
		bl.priceMatch();
		System.out.println("-------------------------------");	

		bl = new ChaseBank();
		bl.interestRate();
		bl.priceMatch();

	}

}
