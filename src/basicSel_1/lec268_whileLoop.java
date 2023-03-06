package basicSel_1;

public class lec268_whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Printing No 0 - 10 sequentially
		/*
		 * So the basic syntax of while loop is while of boolean expression
		 * [while(boolean - true)] if this boolean expression returns true then control
		 * will go inside the loop, if the expression is false then control wiil not go
		 * inside the loop
		 */

		int i = 0;
		while (i <= 10) // this condition remains true until i=10 if i=11 then this condition false and
						// control loose
		{
			System.out.println(i);
			i++;
		}
	}
}
