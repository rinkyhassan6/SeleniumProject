package javaDemo;

import java.util.Scanner;

public class CountPosNegNums {


	public static void main(String[] args) {
		
		/*How do you find the positive and negative numbers in an array?
		 * Input:
		 * Array elements : 2,-5,11,0,30,-17,48,54,-69
		 * Output :
		 * total elements of arrays : 9
		 * total positive number : 5
		 * total negative number : 3
		 * total Zero : 1
		 */
		
		
		int n,pos=0,neg=0,zero=0,i;
		int arr[]=new int[9];
		
		// Create a Scanner object
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number as input ------------");
		
		
		// Numerical input
		 n=sc.nextInt();
		 
		 System.out.println("Enter the total elements of Arrays ------------");
		
		for (i= 0; i<n; i++) 
		{
			arr[i]=sc.nextInt();
			
		}
		
		
		for (i= 0; i<n; i++) 
		{
			if (arr[i]<0)
			 neg++;
		else if (arr[i]==0)
			zero++;
		else
			pos++;
		}
		
		 // Output input by user
		 System.out.println("Positive numbers :" + pos);
		 System.out.println("Negarive numbers :" + neg);
		 System.out.println("Positive number :" + zero);
		
		
	} 

}

