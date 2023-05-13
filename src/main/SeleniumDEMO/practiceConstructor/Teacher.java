package practiceConstructor;

public class Teacher {
	String name, gender;   //declaring the variables
	int phoneNo;
	Teacher(String n, String g, int p){    //here Teacher is a constructor
		name=n;
		gender=g;
		phoneNo=p;	
	}
	void displayInfo() {          //here it's a method because it has return type
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("phoneNo: " + phoneNo);
	}
	public static void main(String[] args) {
		Teacher teacher = new Teacher("Ridha","Female",123456780);
		teacher.displayInfo();	
		Teacher teacher1 = new Teacher("Lovely","Female",123456781);
		teacher1.displayInfo();	
	}

}
