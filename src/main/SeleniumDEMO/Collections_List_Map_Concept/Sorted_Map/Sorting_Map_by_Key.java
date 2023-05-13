package Collections_List_Map_Concept.Sorted_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Sorting_Map_by_Key {

	public static void main(String[] args) {

		//Create maps for 10 States and Cities of the USA using HashMap, TreeMap, and LinkedHashMap implementation classes and implements all of the methods map.
		//Sorting Hashmap keys alphabetically   // Create TreeMap by passing HashMap object
		System.out.println("          =======================Under one Single CLASS we are Creating 3 sets of maintaining Random, Ascending, and Inserting order (By Passing Objects and Sorting by KEYS)=======================                                 ");
		System.out.println("                                           Creating LinkedHashMap for 10 States and Cities of USA by using Same Data Type (String,String)                              ");

		//Maintains Order of put/Insert
		Map<String, String> state_city = new LinkedHashMap<String, String>();

		state_city.put("California", "Sacramento");
		state_city.put("South Carolina", "Columbia");
		state_city.put("Texas", "Austin");
		state_city.put("Washington", "Olympia");
		state_city.put("Kentucky", "Frankfort");
		state_city.put("Louisiana", "Baton Rouge");
		state_city.put("New York", "	Albany");
		state_city.put("Hawaii", "Honolulu");

		System.out.println("                                                                                       Count of the state_city/size is : " + state_city.size());
		state_city.remove("Kentucky");
		state_city.put("Arizona", "Phoenix");
		state_city.put("Utah", "Salt Lake City");
		state_city.put("Maryland", "Annapolis");

		System.out.println("                                            After removing 1 element and adding 2 new elements Total count of the state_city/size is : " + state_city.size());	


		System.out.println("                                                                   Printing all element individually by using LOOP which Maintains Inserting Order of KEYS due to LinkedHashMap --------");

		for (Entry<String, String> eachstate_city : state_city.entrySet()) {
			System.out.println(eachstate_city.getKey() +"  , "+ eachstate_city.getValue());

		}

		//ContainsValue- Search by Key
		state_city.containsKey("Hawaii");
		System.out.println( "                            The name Hawaii contains in the list and it's : " + (state_city.containsKey("Hawaii")));   //true/false




		//Maintains Random Order by creating HashMap  // by Passing LinkedHashMap object "state_city"

		Map<String, String> state_city1 = new HashMap<String, String>(state_city);


		System.out.println("                                                                 Printing all element individually by using LOOP which Maintains Random Order of KEYS due to HashMap--------");

		for (Entry<String, String> eachstate_city1 : state_city1.entrySet()) {
			System.out.println(eachstate_city1.getKey() +"  , "+ eachstate_city1.getValue());

		}

		//ContainsValue- Search by Value
		state_city.containsValue("Frankfort");
		System.out.println( "                            The Value Frankfort contains in the list and it's : " + (state_city.containsValue("Frankfort")));   //true/false   

		//Maintains Ascending Order by creating TreeMap  // by Passing HashMap object "state_city1"  //Sorting Hashmap KEYS alphabetically 

		Map<String, String> state_city2 = new TreeMap<String, String>(state_city1);

		System.out.println("                                                                Printing all element individually by using LOOP which Maintains Ascending Order of KEYS due to TreeMap--------");

		for (Entry<String, String> eachstate_city2 : state_city2.entrySet()) {
			System.out.println(eachstate_city2.getKey() +"  , "+ eachstate_city2.getValue());

		}


		//clear()- all map items , //Removes all Map entry
		state_city.clear();
		state_city1.clear();
		state_city2.clear();

		//size will be zero
		System.out.println(  "                                                              After Clear all of the Map items Total name of the state_city/size/count is : " +                               state_city2.size()); 
		System.out.println(  "                                                              After Clear all of the Map items Total name of the state_city1/size/count is : " +                              state_city2.size()); 
		System.out.println(  "                                                              After Clear all of the Map items Total name of the state_city2/size/count is : " +                              state_city2.size()); 









	}

}
