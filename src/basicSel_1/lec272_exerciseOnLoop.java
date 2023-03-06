package basicSel_1;

public class lec272_exerciseOnLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * with the help of nested loop print the output in the following format 
		 * 1 2 3 4
		 * 5 6 7 
		 * 8 9 
		 * 10
		 */

		System.out.println("== Exercise on Loop ==");
		System.out.println("");
		int k = 1;
		for (int i = 0; i < 4; i++) // this block execute for 4 times but while one execution of outer loop it need
										// to complete 4 execution of inner loop
		{
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
	}
}
