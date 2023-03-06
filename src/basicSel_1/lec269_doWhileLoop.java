package basicSel_1;

public class lec269_doWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Printing No 20 - 30 sequentially
		/*
		 * 1 loop of execution is guaranteed in do while loop without any boolean
		 * expression it executing one line of code and for second expression it compare
		 * with condition and then next execution.
		 * 
		 * so it is use when we need to first print and then compile
		 */
		System.out.println("== Printing No 20 - 30 sequentially ==");
		int i = 20;
		do {
			System.out.println(i);
			i++;
		} while (i <= 30); // this condition remains true until i=10 if i=11 then this condition false and
							// control loose
		System.out.println("");
		System.out.println("== wrong condition ==");
		int p = 20;
		do {
			System.out.println(p);
			p++;
		} while (p < 10); // no matter of condition it execute once.

	}
}
