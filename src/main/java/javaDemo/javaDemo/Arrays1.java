package javaDemo;


public class Arrays1 {

	public static void main(String[] args) {
		
		
		//Primitive DataType-int and NonPrimitive DataType-arrays
		//syntax 
		//int[]Marks = {60,65,70,78, 80,86,90,92,95}; 
		//here Marks is arrays
		
		
		int[] marks = {60,65,70,78,80,86,90,92,95};
		
		//Get particular value from arrays	
		//System.out.println(marks[i]);
		System.out.println("a)Print a particular index value from the array.....");
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[5]);
		System.out.println(marks[6]);
		System.out.println(marks[7]);
		System.out.println(marks[8]);
	
		
		//Get count of arrays -array.length
		//System.out.println(marks.length);
		
		System.out.println("b)Print gets count of array.....");
		
		System.out.println(marks.length);
		
		
		System.out.println("c)Print all value from the array");
		
		//Print all value from Arrays use -for loop
		//for(int i= 0 ; i <= 3; i++) {			
		//System.out.println(obj[i]);
		
		for(int i= 0 ; i<marks.length; i++){
	    System.out.println(marks[i]);
	    }
	    
		
		
		
	}

}
