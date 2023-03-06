package collectionAPI;

import java.util.HashSet;
import java.util.Iterator;

public class lec314_HashSetExample {

	public static void main(String[] args) {
	
		// HashSet, TreeSet, LinkeHashSet implements Set Interface
		//set interface does not accepts duplicate values (use this for coupon code which is expire after one use)
		//array list accepts duplicate values (use in add to cart just quantity get 1 to 2)
		//no guarantee that elements store in sequential order.. may store in random order
		//you will not see any thing related to index
		
		HashSet<String> hash = new HashSet<String>();
		hash.add("India");
		hash.add("USA");
		hash.add("UK");
		hash.add("Pakistan");
		System.out.println(hash);
		
		//size of the set
		System.out.println("Size of set : "+hash.size());
		
		//reove any value
		hash.remove("Pakistan");
		System.out.println(hash);
		
		//is empty
		System.out.println("Is Empty : "+hash.isEmpty());
		
		//iterator
		Iterator<String> iterat = hash.iterator();
		System.out.println("Iterator : "+iterat.next());
		//it iterate till the last if there is no value loop get false and close
		while (iterat.hasNext()) {
			System.out.println("While Loop : "+iterat.next());
		}
	}
}
