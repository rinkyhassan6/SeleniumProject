package Abstractions_Concept02_Interface_MultipleInheritenance;

public class TestClass_Interface {

	public static void main(String[] args) {
		
		//create an Object for class "FinancialCenter" for calling all the Abstaract Methods from interface
		
		FinancialCenter fc = new FinancialCenter();
		fc.activation();
		fc.deposit();
		fc.withdraw();
		fc.check() ;
		fc.transfer();
		fc.open();
		fc.apply();
		fc.close();
		fc.access();

	}

}
