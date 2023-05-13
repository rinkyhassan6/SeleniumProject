package Collections_List_Map_Concept;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap_AscendingOrder {

	public static void main(String[] args) {
		

		// Creating a Result sheet with student Name and CGPA for different data type by using TreeMap to keep the Ascending order


		System.out.println(
				"          -------------------------Result sheet with student Name and CGPA for different data type (String,Float) --------------------------------                                 ");
		System.out.println("                             ");

		Map<String, Double> Result = new TreeMap<String, Double>();	
		
		
		//Maintain Ascending order of Alphabets
		Result.put("Sumi", 2.50);
		Result.put("Choyon", 2.85);
		Result.put("Aman", 3.90);
		Result.put("Nipa", 3.35);
		Result.put("Ruma", 2.75);
		Result.put("Sumon", 3.0);
		Result.put("Jony", 3.30);
		Result.put("Yaafi", 4.0);
		Result.put("Zara", 3.4);
		
		
		
		System.out.println(Result);
		System.out.println("                             ");
		System.out.println("                             ");

		// Get the count of the Grocery
		System.out.println("                             ");
		System.out.println("                             ");

		System.out.println("                           Total name of the Result/size/count is : " + Result.size());

		// Print all items inside the list or print the names individually by using LOOP
		System.out.println(
				"                           Print all items inside the list or print the names individually by using LOOP --------");

		for (Entry<String, Double> eachResult : Result.entrySet()) {
			System.out.println(eachResult.getKey() + "  , " + eachResult.getValue());

		}

		
		
		// Remove()-a particular item , // just pass the Key
		Result.remove("Sumon");
		System.out.println(
				" --------------------------- Removing Sumon from the List   ----------------------------------- ");

		// After remove Size of Map

		System.out.println("                           Total name of the Result/size/count is : " + Result.size());

		// Print all items inside the list or print the names individually by using LOOP
		System.out.println(
				"                           Print all items inside the list or print the names individually by using LOOP --------");

		for (Entry<String, Double> eachResult : Result.entrySet()) {
			System.out.println(eachResult.getKey() + "  , " + eachResult.getValue());

		}

		// Adding 2 new Item "Emad" and "Mita" , after that we will check size/count again

		Result.put("Emad", 4.0);
		Result.put("Mita", 3.9);
		
		
		
		System.out.println(
				"                           After adding 2 new items Total name of the Result/size/count is : "
						+ Result.size());
		
		
		
		// Print all items inside the list or print the names individually by using LOOP
		System.out.println(
				"                           Print all items inside the list or print the names individually by using LOOP --------");

		for (Entry<String, Double> eachResult : Result.entrySet()) {
			System.out.println(eachResult.getKey() + "  , " + eachResult.getValue());

		}

		
		// ContainsKey()-Search by the Key

				System.out.println(" ------------------------------------------------------------------- ");

				Result.containsKey("Jony");
				System.out.println("                            The Item Jony contains in the list and it's : "
						+ (Result.containsKey("Jony"))); // true/false
				// ContainsValue- Search by Value

				Result.containsValue(4.2);
				System.out.println("                            The Value 4.2 contains in the list and it's : "
						+ (Result.containsValue(4.2))); // true/false

				// clear()- all map items , //Removes all Map entry
				Result.clear();
				// size will be zero
				System.out.println(
						"                            After Clear all of the Map items Total name of the Result/size/count is : "
								+ Result.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
