package Arrays;

public class lec285_Arrays {

	/*
	 * - lets say "int a = 4;" so integer value 4 is stored in variable "a"
	 * 
	 * - so what if I want to store multiple values of same data type in a variable
	 * - Arrays - is a container which stores multiple values of same data type
	 * - String a[] = new String [5] (or) String b[] = {"mango", "apple"} 
	 */
	
	
	public static void main(String[] args) {

		int a[] = new int[5];
		a[0] = 20;
		a[1] = 54;
		a[2] = 34;
		a[3] = 23;
		a[4] = 78;

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print("\t");
		}

		int b[] = { 40, 47, 24, 67, 25, 67 };

		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j]);
			System.out.print("\t");
		}
	}
}
