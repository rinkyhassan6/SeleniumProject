package practiceConstructor;

public class Human {
	String name, gender;      //declaring the variables
	int idNo;
	//2 types of Constructor: Default constructor(no parameter) & Parametrized constructor(with Arg)
	Human(){                       //Default Constructor or No parameter Constructor (NO arguments)
		System.out.println("no data");
	}
	Human(String n, String g){              //Parameterized Constructor(single data type)
		name=n;
		gender=g;
	}
	Human(String n, String g, int i ){           //Parameterized Constructor(2types of data type)
		name=n;
		gender=g;
		idNo=i;
	}
	void displayInfo() {
		System.out.println("name: " +name);
		System.out.println("gender: " +gender);
		System.out.println("idNo: " +idNo);
	}
	public static void main(String[] args) {           //Creating Main method
		Human human = new Human();          //Default Constructor(no Arguments)
		human.displayInfo();
		Human human1 = new Human("Musaddik","Male");   //Parameterized Constructor(single data type)
		human1.displayInfo();
		Human human2 = new Human("Rubel","Male",12234);  //Parameterized Constructor(2types of data type)
		human2.displayInfo();
	}
}
