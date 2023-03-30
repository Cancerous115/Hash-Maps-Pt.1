import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> examScores= new HashMap<String, Integer>();
  	//put method o put something in our HashMaps
		//ex:"Math os pur key and 80 is the integer"
		examScores.put("Math",80);
		examScores.put("English",75);
		examScores.put("History",86);
		examScores.put("Sociology",76);
		//Also we may insert a new Key with a ddifferent value with pit.IfAbsent Method.
		examScores.putIfAbsent("Health and Nutrition",85);
		//Or we can replace a key with the replace method
		examScores.replace("Math",70);

		//if we want to clear our hashmap we can insert clear method
		//Ex: examScores.clear();
		///To remove from one of our Key we use the remove method.
		//EX: examScores.remove("Math");
		System.out.println(examScores.toString());
		
		//to get a single answer we use the get method we insert the KEY. For this example we use our key "History"
		System.out.println(examScores.get("History"));
		//We can also attempt to get a key that doesn't exist.and we can make the value equal whatever we want for said key.With "getOrDefault" method we can isnert a non existent Key then give it a value to print. 
		System.out.println(examScores.getOrDefault("Religion",-1));
		//Check the number of elements in our HashMap
		System.out.println(examScores.size());
		//Check if a key exists in our hashmap
		System.out.println(examScores.containsKey("Math"));
		//Check if any scores in our Hashmap are true/exist
		//we can also use a refrence type aswell after .containsValue... (Integer.valueOf(76)));
		System.out.println(examScores.containsValue(76));
		//Check if our hashMap is empty or not
		System.out.println(examScores.isEmpty());
	}
}