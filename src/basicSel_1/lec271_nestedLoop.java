package basicSel_1;

public class lec271_nestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("== Nested Loop ==");
		System.out.println("");
		for (int i = 1; i <= 4; i++) // this block execute for 4 times but while one execution of outer loop it need
										// to complete 4 execution of inner loop
		{
			System.out.println("Outer Loop Started " + i);
			for (int j = 1; j <= 4; j++) {
				System.out.println("Inner Loop " + j);
			}
			System.out.println("Outer Loop Finished");
			System.out.println("");
		}

	}
}
