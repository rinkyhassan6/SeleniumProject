package Inheritance_Concept;

public class Toyota extends Audi{

	//declaring the 1 variable for Sub Class-3 /Child class-3

	String DRCC;

	public void DRCC() {
		System.out.println(" DRCC (Dynamic Radar Cruise Control) is an excellent new toyota technology" );
	}


	//Create 5th class called RunClass including main method. Create object for Toyota and call all the methods (sub and super class methods) from RunClass 
	//Audi inherit Car and Toyota inherit Audi (Multi level)

	public static void main(String[]args) {

		System.out.println("              1)Vehicle is parent/super/Base class");
		System.out.println("              2)Car is Sub Class-1 /Child class-1");
		System.out.println("              3)Audi is Sub Class-2 /Child class-2");
		System.out.println("              4)Toyota is Sub Class-3 /Child Class-3");
		System.out.println("****************Created Multi level Inheritance ***************");
		System.out.println("                                                                             ");


		Toyota RunClass = new Toyota();

		RunClass.Fuel();
		RunClass.Wheels();
		RunClass.Brake();
		RunClass.Sunroof();
		RunClass.Bluetooth();
		RunClass.Connect();
		RunClass.DRCC();

		//Create 6th class called RunClass2 iunder the main method. Create object for Car and call all the methods (from super class methods ) from RunClass2
		//Car should inherit Vehicle (single level)


		System.out.println("                                                                             ");
		System.out.println("              1)Vehicle is Base/parent/super class");
		System.out.println("              2)Car is Sub Class /Child class");
		System.out.println("===========Created Single level Inheritance =============");
		System.out.println("                                                                             ");

		Car RunClass2 =new Car();

		RunClass2.Bluetooth();
		RunClass2.Sunroof();
		RunClass2.Brake();
		RunClass2.Fuel();
		RunClass2.Wheels();





	}



















}
