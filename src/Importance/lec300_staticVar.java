package Importance;

public class lec300_staticVar {

	//creating a instance variables (global variables)
	String name;
	String address;

	/*
	 * If you observe the data city is common for all objects, in run time java creates a memory for the city object
	 * so our data is limited for the Mumbai city only
	 * so creating a static variable to the city and declaring globaly as a Mumbai
	 * 
	 * -static key words are independent of object (for calling them no need to create an object) they are called by class name
	 */
	static String city = "Mumbai";
	//no matter the numbers of object static variable is reflected
	static int i = 0;
	/*
	 * Whenever you declare any variable are static, then that variable is part of the class, but not object, 
	 */
	
	//static variables are declare by the block also
	static {
		city = "Mumbai";
		i = 0;
	}
	
	
	// creating a constructor first
	
	/*
	 * -- What is a constructor? 
	 * - So constructor is the place where you can initialize
	 * your variables or you can do any operation in constructor.
	 * 
	 * -- why we ceate a Constructor?
	 * - So this constructor will be automatically called when you create object for this class.
	 */
	
	lec300_staticVar(String name, String address) // this is a constructor -- which is created on class name assigning a local variables
	{	
		//now connecting the global variables with the local variables
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}

	public void getName()
	{
		System.out.println("Name : "+name +" - City : "+ city);
	}
	
	public static void getCity()
	{
		/*
		 * creating a static method
		 * so static method accepts static variables only
		 * ex - address
		 */
		//System.out.println(address);
		System.out.println("From static method : "+city);
	}

	public static void main(String[] args) {
		//creating the object for the class
		/*
		 *  so on object creation, if there is any, explicitly defined the constructor 
		 *  that will be invoked now in my public static void main, 
		 *  I would just create object for this class to remember 
		 *  that objects for class cannot be created outside of main method,
		 *  that they should be inside the main method.
		 *  
		 *  
		 *  If you want to still access the methods and variables of your own class,
		 *  then also you should create an object for that class. OK, so no matter 
		 *  if you are in the same class, another class, if you want to create or 
		 *  access any methods or variables, it's mandatory for you to create object 
		 *  of your own class as well. And that should be done only in public static void main.
		 */
		
		lec300_staticVar Pravin = new lec300_staticVar("Pravin", "Ghatkopar");
		lec300_staticVar Prashant = new lec300_staticVar("Prashant", "Dadar");
		lec300_staticVar Prakash = new lec300_staticVar("Prakash", "Dadar");
		lec300_staticVar Dyanesh = new lec300_staticVar("Dyanesh", "Dadar");
	
		lec300_staticVar.getCity();;
		
		
		Pravin.getName();
		Prashant.getName();
		Prakash.getName();
		Dyanesh.getName();
	}
	
}
