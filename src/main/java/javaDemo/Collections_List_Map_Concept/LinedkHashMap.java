package Collections_List_Map_Concept;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinedkHashMap {

	public static void main(String[] args) {
		
		//Creating an Employee list of Bank of America with Name and ID for same data type by using LinkedkHashMap to keep the Inserting order


		System.out.println("          -------------------------Employee List with Name and ID for Same Data Type (String,String) --------------------------------                                 ");
		 System.out.println("                             ");
		 
		 
		//Maintains Order of put/Insert
        Map<String, String> EmployeeList = new LinkedHashMap<String, String>(); 
		
        EmployeeList.put("Gloria", "gloria245");
        EmployeeList.put("Cathy", "cathy087");
        EmployeeList.put("John", "john555");
        EmployeeList.put("Emma", "emma932");
        EmployeeList.put("Shaun", "shaun061");
        EmployeeList.put("Mallory", "mallory309");
        EmployeeList.put("Elena", "elena111");
        EmployeeList.put("Julie", "julie877");
        EmployeeList.put("Tom", "tom470");
        EmployeeList.put("Lisa", "lisa205");
		
		
		
        System.out.println(EmployeeList);
        System.out.println("                             ");
		  System.out.println("                             ");
		  
	        //Get the count of the EmployeeList
			  System.out.println("                             ");
			  System.out.println("                             ");
			  
			  System.out.println("                           Total name of the EmployeeList/size/count is : " + EmployeeList.size());
		  
      //Print all items inside the list or print the names individually by using LOOP
        System.out.println("                           Print all items inside the list or print the names individually by using LOOP --------");
        
        for (Entry<String, String> eachEmployeeList : EmployeeList.entrySet()) {
        	  System.out.println(eachEmployeeList.getKey() +"  , "+ eachEmployeeList.getValue());
  			
  		}
		

     
		 
		
		  //get(); and Override for Key
		//Adding a new name "Cathy" , after that we will check size/count again ,total count will be same because the name "Cathy" will be OVERRIDE with different value in the list
		  
		  EmployeeList.put("Cathy", "cathy321");
		  
		  System.out.println("                            Added a new name which is similar/duplicate with a previous name so it will be override by the new Value  :             " + "Cathy");
		  
		  
	      //Print all items inside the list or print the names individually by using LOOP
	        System.out.println("                            Print all items inside the list or print the names individually by using LOOP --------");
	        
	        for (Entry<String, String> eachEmployeeList : EmployeeList.entrySet()) {
	        	  System.out.println(eachEmployeeList.getKey() +"  , "+ eachEmployeeList.getValue());
	  			
	  		}
			
		  
		  System.out.println("                             Total name of the EmployeeList/size/count is : " + EmployeeList.size());
		     
		  
		  //Remove()-a particular item  ,  // just pass the Key
		  EmployeeList.remove("Tom");
		  System.out.println(" --------------------------- Removing Tom from the List   ----------------------------------- ");
		  
		  //After remove Size of Map 
		  
	        for (Entry<String, String> eachEmployeeList : EmployeeList.entrySet()) {
	        	  System.out.println(eachEmployeeList.getKey() +"  , "+ eachEmployeeList.getValue());
	  			
	  		}
			
		  
		  System.out.println("                            After removing Total name of the EmployeeList/size/count is (after Removing one Name) : " + EmployeeList.size());
		  //ContainsKey()-Search by the Key
		  
		  System.out.println(" ------------------------------------------------------------------- ");
		  
		  EmployeeList.containsKey("John");
		  System.out.println( "                            The name John contains in the list and it's : " + (EmployeeList.containsKey("John")));   //true/false
		  //ContainsValue- Search by Value
		  EmployeeList.containsValue("gloria245");
		  System.out.println( "                            The Value gloria245 contains in the list and it's : " + (EmployeeList.containsValue("gloria245")));   //true/false   
		
		  //clear()- all map items , //Removes all Map entry
		  EmployeeList.clear();
		  //size will be zero
		  System.out.println(  "                            After Clear all of the Map items Total name of the EmployeeList/size/count is : " +                              EmployeeList.size()); 
		
		
		
	}

}
