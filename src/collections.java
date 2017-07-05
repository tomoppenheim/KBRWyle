import java.util.*;


public class collections {

	public static void main(String[] args) {
		//Create first two collections, add numbers in random order
		ArrayList<Integer> collection1 = new ArrayList<Integer>();
		ArrayList<Integer> collection2 = new ArrayList<Integer>();
		
		collection1.add(2);
		collection1.add(4);
		collection1.add(7);
		collection1.add(3);
		collection1.add(6);
		collection1.add(5);
		collection1.add(1);
		collection1.add(9);
		collection1.add(10);
		collection1.add(8);
		
		collection2.add(15);
		collection2.add(12);
		collection2.add(9);
		collection2.add(7);
		collection2.add(10);
		collection2.add(14);
		collection2.add(11);
		collection2.add(8);
		collection2.add(13);
		collection2.add(6);
		
		/* Removed for not adding numbers randomly
		for (int i = 1; i <= 10; i++){
			collection1.add(i);
		
		 Removed for not adding numbers randomly
		for (int i = 6; i <= 15; i++){
			collection2.add(i);
		}
		*/
		
		//Print collection 1 and size
		System.out.println("Collection 1:");
		for(Integer counter: collection1){
			System.out.println(counter);
		}
		System.out.println("Size of collection 1: " + collection1.size());
		
		
		
		
		//Print collection 2 and size
		System.out.println("Collection 2:");
		for(Integer counter: collection2){
			System.out.println(counter);
		}
		System.out.println("Size of collection 2: " + collection2.size());
		
		//Creates third collection, adds all of collection 1 and two, then sorts.
		ArrayList<Integer> collection3 = new ArrayList<Integer>();
		collection3.addAll(collection1);
		collection3.addAll(collection2);
		Collections.sort(collection3);
		
		
		
		System.out.println("Collection 3:");
		//Traverses sorted list to check if previous value match current selection, removes if true
		 for (int i = 1; i < collection3.size(); i++){
			 if(collection3.get(i) == collection3.get(i-1)){
				 collection3.remove(i);
			 }
		 }
		
		 // Remove middle entry
		 collection3.remove((collection3.size()-1)/2);
		 
		 // Prints collection backwards
		for(int i = collection3.size()-1; i >= 0; i--){
			System.out.println(collection3.get(i));
		}
		System.out.println("Size of collection 3: " + collection3.size());
		
		//Create hashmap, add 5 values for my family members. I chose to use a hashmap because
		//hashmap contained all neccesary methods to complete this task while being the most user friendly
		HashMap<Integer, String> collection4 = new HashMap<Integer, String>();
		collection4.put(1, "Tom");
		collection4.put(2, "Shannon");
		collection4.put(3,"Sheila");
		collection4.put(4,"Jon");
		collection4.put(5,"Katie");
		
		//Check if key 1 is already full, if not, add Tom, is so, return value of key
		if (!collection4.containsKey(1)){
			collection4.put(1, "Tom");
		}
		else{
			System.out.println("Key already present, value is: " + collection4.get(1));
		}
		
		// Return all key's and their associated values.
		for (Map.Entry<Integer, String> entry : collection4.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key " + key + ": Value " + value);
		}
		System.out.println("The size of collection 4: " + collection4.size());
	}
}