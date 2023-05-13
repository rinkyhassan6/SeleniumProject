package Collections_List_Map_Concept;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HashMap_RandomOrder {

	public static void main(String[] args) {

		// Creating a Grocery list with name and weight for different data type by using HashMap to keep the Random order 

		System.out.println(
				"          -------------------------Grocery list with Name of the Items and weight(gm) for Different Data Type (String,Integer) --------------------------------                                 ");
		System.out.println("                             ");

		Map<String, Integer> Grocery = new HashMap<String, Integer>();

		Grocery.put("Rice", 1000);
		Grocery.put("Sugar", 250);
		Grocery.put("Patotes", 300);
		Grocery.put("Chilli", 100);
		Grocery.put("Salt", 50);
		Grocery.put("Fish", 800);
		Grocery.put("Meat", 700);
		Grocery.put("Mangoo", 600);
		Grocery.put("Cheese", 350);
		Grocery.put("Salad", 200);

		System.out.println(Grocery);
		System.out.println("                             ");
		System.out.println("                             ");

		// Get the count of the Grocery
		System.out.println("                             ");
		System.out.println("                             ");

		System.out.println("                           Total name of the Grocery/size/count is : " + Grocery.size());

		// Print all items inside the list or print the names individually by using LOOP
		System.out.println(
				"                           Print all items inside the list or print the names individually by using LOOP --------");

		for (Entry<String, Integer> eachGrocery : Grocery.entrySet()) {
			System.out.println(eachGrocery.getKey() + "  , " + eachGrocery.getValue());

		}

		// Remove()-a particular item , // just pass the Key
		Grocery.remove("Cheese");
		System.out.println(
				" --------------------------- Removing Cheese from the List   ----------------------------------- ");

		// After remove Size of Map

		System.out.println("                           Total name of the Grocery/size/count is : " + Grocery.size());

		// Print all items inside the list or print the names individually by using LOOP
		System.out.println(
				"                           Print all items inside the list or print the names individually by using LOOP --------");

		for (Entry<String, Integer> eachGrocery : Grocery.entrySet()) {
			System.out.println(eachGrocery.getKey() + "  , " + eachGrocery.getValue());

		}

		// Adding 2 new Item "Onion" and "Tomatoes" , after that we will check size/count again

		Grocery.put("Onion", 300);
		Grocery.put("Tomatoes", 400);

		System.out.println(
				"                           After adding 2 new items Total name of the Grocery/size/count is : "
						+ Grocery.size());

		// Print all items inside the list or print the names individually by using LOOP
		System.out.println(
				"                           Print all items inside the list or print the names individually by using LOOP --------");

		for (Entry<String, Integer> eachGrocery : Grocery.entrySet()) {
			System.out.println(eachGrocery.getKey() + "  , " + eachGrocery.getValue());

		}
		
		// ContainsKey()-Search by the Key

		System.out.println(" ------------------------------------------------------------------- ");

		Grocery.containsKey("Tomatoes");
		System.out.println("                            The Item Tomatoes contains in the list and it's : "
				+ (Grocery.containsKey("Tomatoes"))); // true/false
		// ContainsValue- Search by Value

		Grocery.containsValue(300);
		System.out.println("                            The Value 300 contains in the list and it's : "
				+ (Grocery.containsValue(300))); // true/false

		// clear()- all map items , //Removes all Map entry
		Grocery.clear();
		// size will be zero
		System.out.println(
				"                            After Clear all of the Map items Total name of the Grocery/size/count is : "
						+ Grocery.size());

		
		
	}

}
