package Keywords;

public class lec299_thisKeyword {

	// Interview Que - print the a variable in console which is globally declare

	// declaring global variable "a"
	int a = 4;

	public void getData() {
		int a = 23;
		System.out.println("method level output : " + a);

		// for printing globally declare variable we need to use a "this"
		// this catches the class object -- this have scope on the class level not the
		// method level
		System.out.println("class level output : " + this.a);

		// we can perform mathematical operation on them
		int add = a + this.a;
		System.out.println("Addition : " + add);
	}
	// super is the keyword use to call the variable which is declare at global
	// level

	public static void main(String[] args) {

		lec299_thisKeyword key = new lec299_thisKeyword();
		key.getData();

	}
}
