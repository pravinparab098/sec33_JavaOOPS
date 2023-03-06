package collectionAPI;

import java.util.ArrayList;

public class lec311_implementationOfArrayList {

	public static void main(String[] args) {
		//ArrayList can accepts duplicate values
		//Note : ArrayList, LinkedList, vector 	can implementing list interface
		
		 /*
		 * Array have fixed size and ArrayList can grow 
		 * you can access and insert any value 	in any index
		 */
		
		//Allocating memory by giving new operator and giving a dataType
		ArrayList<String> arrLst = new ArrayList<String>(); 
		//so here we don not need to define the size of the array (size is not fix it dynamic)
		//increase and decrease according to requirement
		//no need to provide index of array
		arrLst.add("Pravin");
		arrLst.add("Its List of Array");
		arrLst.add(0, "Mr.");
		arrLst.add("Lets learn selenium");
		arrLst.add("Java");
		System.out.println(arrLst);
		
		//you can remove array according to
		//- index
		arrLst.remove(0);
		System.out.println("0th index removed "+arrLst);
		arrLst.remove("Pravin");
		System.out.println("Pravin removed "+arrLst);
		
		//you can print the array according to
		//- index
		arrLst.get(1);
		System.out.println("get 2"+arrLst);
		//this keyword contains or not
		System.out.println("Contains - "+arrLst.contains("testing"));
		System.out.println("Contains - "+arrLst.contains("Lets learn selenium"));
		
		//want to know the index of particular string
		System.out.println("Index of "+arrLst.indexOf("Lets learn selenium"));
		
		//size of array
		System.out.println("size of array : "+arrLst.size());
		//is array is empty
		System.out.println("Is Empty : "+arrLst.isEmpty());
	}
}
