package exception;

public class lec306_exception {

	public static void main(String[] args) {
		
		int a = 84;
		int o = 0;
		
		//any number devided by zero is Arithmetical exception
		
		try {
			int ans = a/o;
			System.out.println("Ans : " +ans);
		} catch (Exception e) {
			
			System.out.println("Arithmetical Exception");
			
		}
		
	}
}
