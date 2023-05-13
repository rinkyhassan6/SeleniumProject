package Inheritance_Concept;

public class OnlineBanking extends AtmBanking{

	//declaring the variable for Sub Class-2 /Child class-2
	String transfer;
	String payment;
	String apply;

	public void transfer() {
		System.out.println("Client can transfer the money by using Zelle");	
	}

	public void payment() {
		System.out.println("Client can do payment for credit card or billpay");	
	}

	public void apply() {
		System.out.println("Client can apply for the crdit card");	
	}

	//creating object from subclass-2/child-2 to print parent and child class all together

	public static void main(String[]args) {

		System.out.println("              1)BankOfAmerica is parent/super class");
		System.out.println("              2)AtmBanking is Sub Class-1 /Child class-1");
		System.out.println("              3)OnlineBanking is Sub Class-2 /Child class-2");
		System.out.println("--------------------we create Multilevel Inheritance ----------------------");
		System.out.println("                                                                             ");

		OnlineBanking object = new OnlineBanking();

		object.open();
		object.close();
		object.access();
		object.withdraw();
		object.deposit();
		object.acctivate();
		object.transfer();
		object.payment();
		object.apply();







	}	


}
