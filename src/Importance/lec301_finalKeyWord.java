package Importance;

/*
 * we can declare the class as a final class -- but if you declare the class as a final 
 * then you can not extends that class 
 * (you can not use that as a parent class for any class)
 */

public class lec301_finalKeyWord {

	public static void main(String[] args) {

		final int f = 4;
		// if you declare any variable as a final then you can not change that
		// variable.. its a constant value
		// i = 5; -- error
	}
	
	final void getData()
	{
		//we can declare the method as a final -- so final method can not be overwrite or reuse with the same name again
	}
}
