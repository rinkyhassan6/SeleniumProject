package javaDemo;

public class Concep_LeapYear {

	public static void main(String[] args) {
		
	/*
	 check if a year is LEAP year or not.
	 
#Concept of Leap Year - 

“Every year that is exactly divisible by 4 is a leap year, except for years that are exactly divisible by 100, 
but these centurial years are leap years if they are exactly divisible by 400.”

condition 1) 
             year % 400 == 0 
OR
condition 2)
            year % 4 == 0 && year % 100 != 0 

#example,
if year = 2000, it is leap year,(Condition 1 satisfied)
but if year = 2200, is NOT a leap year, (Cond. 2 not satisfied),
and if year = 2024, is a leap year, (Cond. 2 satisfied).

 #By using IF/ELSE and Modulo Operator we need to check the following 3 conditions:
 
IF
1. Any year that is divisible by 400 is definitely a leap year.
ELSE IF
2. If divisible by 4 AND not divisible by 100 then a leap year.
ELSE
not a leap year.	

 
        if(year%400==0)
        {
            System.out.println("Leap Year");
        }
        else if(year%4==0 && year%100!=0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }

	 */
		
		
		System.out.println("-----------Checking a year (2000,2200,2024) it's LEAP year or not----------");
	
		System.out.println("                          ");
		
		
		
		//declaring "year" as a variable 
		
		int year=2000;
		
		 
        if(year%400==0) {
       
            System.out.println(year + ":   Is a Leap Year");
        }
        else if(year%4==0 && year%100!=0){
       
        	System.out.println(year + ":   Is a Leap Year");
        }
        else {
       
        	System.out.println(year + ":   Is not a Leap Year");
        }
      
			
		//declaring "year1" as a variable 
		
		int year1=2200;
		
        if(year1%400==0) {
            
            System.out.println(year1 + ":   Is a Leap Year");
        }
        else if(year1%4==0 && year1%100!=0){
       
        	System.out.println(year1 + ":   Is a Leap Year");
        }
        else {
       
        	System.out.println(year1 + ":   Is not a Leap Year");
        }
		
     
      //declaring "year2" as a variable 
		int year2=2024;
		
		
        if(year2%400==0) {
            
            System.out.println(year2 + ":   Will be a Leap Year");
        }
        else if(year2%4==0 && year2%100!=0){
       
        	 System.out.println(year2 + ":   Will be a Leap Year");
        }
        else {
       
        	 System.out.println(year2 + ":   Will not be a Leap Year");
        }
		

	}

}
