package collectionAPI;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class lect316_HashMapExaple {

	public static void main(String[] args) {
	
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		//put method
		map.put(5, "India");
		map.put(1, "USA");
		map.put(2, "UK");
		map.put(3, "Pakistan");
		
		System.out.println("get "+map.get(5));
		System.out.println("Remove :" + map.remove(3));
		
		//Entry Set
		Set set =	map.entrySet();
		Iterator iterate = set.iterator();
		 
		while (iterate.hasNext()) {
			//now separate key and value 
			Map.Entry entry = (Map.Entry) iterate.next();
			System.out.println("Key "+entry.getKey());
			System.out.println("Value "+entry.getValue());
		} 
	
		while (iterate.hasNext()) {
			System.out.println("While : "+iterate.next());
		}
	}
}
