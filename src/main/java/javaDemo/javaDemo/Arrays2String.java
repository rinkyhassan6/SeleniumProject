package javaDemo;

public class Arrays2String {

	public static void main(String[] args) {
		

		// NonPrimitive DataType- String and Arrays
		//syntax 
		
	    //String[]name = {"David", "Smith", "Erika", "Priscila", "Regina", "Tammy", "Paul", "Garcia"}; 
        // EmployeeName is arrays
				
				
		 String[]name = {"David", "Smith", "Erika", "Priscila", "Regina", "Tammy", "Paul", "Garcia"}; 
				
				//Get particular value from arrays;
		        //System.out.println(names[3]);
				System.out.println("a)Print Priscila from the list.....");
				
				System.out.println(name[3]);
				
				
				//Get count of arrays -array.length
				//System.out.println(EmployeeName.length);
				
				System.out.println("Print Gets count of list.....");
				
				System.out.println(name.length);
				
				
				System.out.println("c)Print all names from the list by using loop.....");
				
				//Print all value from Arrays use -for each loop
				//for (String eachObj : obj) {
				//System.out.println(eachObj);

				

				for(String eachname:name) {
				System.out.println(eachname);

				    }
		
		
	
	}			
}
