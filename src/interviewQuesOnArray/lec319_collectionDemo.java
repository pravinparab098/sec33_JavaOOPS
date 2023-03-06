package interviewQuesOnArray;

import java.util.ArrayList;
import java.util.Iterator;

public class lec319_collectionDemo {

	public static void main(String[] args) {

		/*
		 * go throgh given array which having duplicate numbers so print the number at
		 * once with number of counts how many it repeats and then the find the unoue
		 * number
		 */
		// int a [] = {4,5,5,5,6,4,4,5,9,5}
		/*
		 * Logic : - creating one empty array as b. - then it adds 4 in that array first
		 * check whether 4 number is present in the b if yes then 4 is not accepted and
		 * if no then 4 accepted and counted as one, same time it scan the a whether it
		 * has 4 number
		 * 
		 */

		int que[] = { 4, 5, 5, 5, 6, 4, 4, 5, 9, 5, 3 };

		// creating one empty array list
		ArrayList<Integer> empty = new ArrayList<Integer>();
		// applying for loop to examine the question
		for (int i = 0; i < que.length; i++) {
			// assuming for count
			int count = 0;
			// if empty arrayList not(!) contains i
			if (!empty.contains(que[i])) {
				// then i should add to empty array list
				empty.add(que[i]);
				// count should be add by 1
				count++;
				// Applying again for loop to check does question is contains other i number
				// (for excluding i i+1)
				for (int j = i + 1; j < que.length; j++) {
					if (que[i] == que[j]) {
						// again add one count
						count++;
					}
				}
				System.out.print("Number " + que[i]);
				System.out.print(" is repeating ");
				System.out.print(count + " thimes in question");
				System.out.println("");

				// if count is 1
				if (count == 1) {
					System.out.println("and " + que[i] + " is uniuqe number");
				}
			}
		}
	}
}


/*
 * OOPS Interview questions 
 * 
 * What are the core concepts of OOPS? 
 * OOPS core concepts are; 
 * Abstraction 
 * Encapsulation 
 * Polymorphism 
 * Inheritance 
 * Composition
 * Association 
 * Aggregation
 * 
 * 
 * What is Abstraction?
 * 
 * Abstraction is an OOPS concept to construct the structure of the real world
 * objects. During this construction only the general states and behaviors are
 * taken and more specific states and behaviors are left aside for the
 * implementers.
 * 
 * What is Encapsulation?
 * 
 * Encapsulation is an OOPS concept to create and define the permissions and
 * restrictions of an object and its member variables and methods. A very simple
 * example to explain the concept is to make the member variables of a class
 * private and providing public getter and setter methods. Java provides four
 * types of access level modifiers: public, protected, no modifier and private.
 * 
 * What is the difference between Abstraction and Encapsulation?
 * 
 * “Program to interfaces, not implementations” is the principle for Abstraction
 * and “Encapsulate what varies” is the OO principle for Encapsulation.
 * 
 * Abstraction provides a general structure of a class and leaves the details
 * for the implementers. Encapsulation is to create and define the permissions
 * and restrictions of an object and its member variables and methods.
 * 
 * Abstraction is implemented in Java using interface and abstract class while
 * Encapsulation is implemented using four types of access level modifiers:
 * public, protected, no modifier and private.
 * 
 * What is Polymorphism?
 * 
 * Polymorphism is the occurrence of something in various forms. Java supports
 * various forms of polymorphism like polymorphic reference variables,
 * polymorphic method, polymorphic return types and polymorphic argument types.
 * 
 * What is Inheritance?
 * 
 * A subclass can inherit the states and behaviors of it’s super class is known
 * as inheritance.
 * 
 * What is multiple inheritance?
 * 
 * A child class inheriting states and behaviors from multiple parent classes is
 * known as multiple inheritance.
 * 
 * What is the diamond problem in inheritance?
 * 
 * In case of multiple inheritance, suppose class A has two subclasses B and C,
 * and a class D has two super classes B and C.If a method present in A is
 * overridden by both B and C but not by D then from which class D will inherit
 * that method B or C? This problem is known as diamond problem.
 * 
 * Why Java does not support multiple inheritance?
 * 
 * Java was designed to be a simple language and multiple inheritance introduces
 * complexities like diamond problem. Inheriting states or behaviors from two
 * different type of classes is a case which in reality very rare and it can be
 * achieved easily through an object association.
 * 
 * What is Static Binding and Dynamic Binding?
 * 
 * Static or early binding is resolved at compile time. Method overloading is an
 * example of static binding.
 * 
 * Dynamic or late or virtual binding is resolved at run time. Method overriding
 * is an example of dynamic binding.
 * 
 * What is a Class?
 * 
 * A class is the specification or template of an object.
 * 
 * What is an Object?
 * 
 * Object is instance of class
 */
