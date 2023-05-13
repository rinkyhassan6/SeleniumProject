package Collections_List_Map_Concept;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.set.MapBackedSet;
import org.apache.commons.math3.analysis.function.Add;

public class ArrayList2D {

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
		name.add("Mamun");
		
		System.out.println("                         name of the employee list: " +name);
		
		System.out.println("                         Total name of the employee list/size/count is : " + name.size());
		 
		 System.out.println("                         Print all items inside the list or print the names idividually by using LOOP --------");
		 
		 for(String eachNames : name) { 
			  System.out.println(eachNames);
		  
		  }
		
		  System.out.println("                             ");
		  System.out.println("                             ");
		 
		List<String> ID = new ArrayList<String>();
		
		
		ID.add("mamun501");
		ID.add("rubel301");
		ID.add("rumi201");
		ID.add("ekram701");
		ID.add("musaddek901");
		ID.add("monir555");
		ID.add("lovely333");
		ID.add("Shewlee123");
		ID.add("emad456");
		ID.add("mamun123");
		
		
		System.out.println("                          ID number of the employee list: " +ID);
		
		System.out.println("                          Total ID number of the employee list/size/count is : " + ID.size());
		 
		System.out.println("                          Print all items inside the list or print the ID idividually by using LOOP --------");
		
		for(String eachID : ID) { 
			  System.out.println(eachID);
		  
		  }
			
		
	}

}
