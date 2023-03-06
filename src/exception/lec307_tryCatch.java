package exception;

public class lec307_tryCatch {

	public static void main(String[] args) {

		int a = 84;
		int o = 0;

		// any number devided by zero is Arithmetical exception

		try {
			int ans = a / o;
			System.out.println("Ans : " + ans);
		} catch (ArithmeticException arte) {
			System.out.println("Its Arithmatic Exception");

		} catch (Exception e) {

			System.out.println("Arithmetical Exception");
		}

		try {
			int arr[] = new int[3];
			System.out.println(arr[5]);
		} catch (IndexOutOfBoundsException ibe) {
			System.out.println("Accepts Array related Exception");
		}

		catch (ArithmeticException arte) {
			System.out.println("Its Arithmatic Exception");
		} catch (Exception e) {
			System.out.println("Accepts all Exception Exception");
		}
	}
}
