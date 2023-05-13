package Collections_List_Map_Concept;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.Get;

public class ArrayList1D {

	public static void main(String[] args) {
		
       List<String> name = new ArrayList<String>();
       
		name.add("Mamun");
		name.add("Rubel");
		name.add("Rumi");
		name.add("Ekram");
		name.add("Musaddek");
		name.add("Monir");
		name.add("Lovely");
		name.add("Shewlee");
		name.add("Emad");
		
		System.out.println("Elements of arrays, here we have 9 emlpoyee names, we will add another name .... "
				+ "total will be 10 employee then we will Remove Monir and Replace it by Wadud");
		System.out.println("then we will check Wadud is in the list or no...");
		System.out.println("--------------------------------------------------------");
		
		System.out.println(name);
		
		 //Get the count of the employee name list.out.println(name.size());
		  System.out.println("                             ");
		  System.out.println("                             ");
		  
		  
		  
		  System.out.println("Total name of the employee list/size/count is : " + name.size());
		  
		  
		  //Adding a new name "Mamun" , after that we will chek siz/count again ,total count will be 10 and the name Mmun will be as aduplicate name in the list
		  
		  name.add("Mamun");
		  
		  System.out.println("after adding a new name Total name of the employee list/size/count will be  : " + name.size());
		  
		  
		  
		  System.out.println("                             ");
		  System.out.println("                             ");
		  
		  
		  
		//Print all items inside the list or print the names idividually 
		  
		  System.out.println("                            Print all items inside the list or print the names idividually by using LOOP --------");
		  
		  for(String eachNames : name) { 
			  System.out.println(eachNames);
		  
		  }
		  
		 
		  System.out.println("                             ");
		  System.out.println("                             ");
		  
		  
		  //Remove the Item from the List and Replace a new name at the same position of the list  
             name.remove(5);
             name.add(5, "Wadud");
             System.out.println("Removing name Monir and Replaace by Wadud at the same position");
             System.out.println("New employee list : " + name); 
   
             //checking the new list by using LOOP 
             System.out.println("                             ");
   		     System.out.println("                             ");
   		     System.out.println("                   checking the new list by using LOOP                          ");
   		     
             for(String eachNames : name) { 
   			  System.out.println(eachNames);
   		  
   		  }
   		  
   		  //Pick Particular Item in the List
   		  name.get(6);
   		  System.out.println("                             ");
   		  System.out.println("                 Pick Particular name Lovely from the List :  " +   name.get(6));
             
             
		  //Verifing Particular Item in the List-true/false
		 name.contains("Shewlee");
   		 System.out.println("                 Shewlee contains in the list  :  " +   name.contains("Shewlee"));
		  
		  //Clear the List (all item from the list)
		  name.clear();
		  System.out.println("                             ");
	   	  System.out.println("                 ALL of the items from the list :  " + name );
	   	  
		  
		  //Confirms the List is Empty-true/false

		  name.isEmpty();
		  System.out.println("                             ");
	   	  System.out.println("                 Confirms the List is Empty :  " + name.isEmpty() );
		  
		  

		
	}

}
