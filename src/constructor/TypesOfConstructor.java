package constructor;

public class TypesOfConstructor {

	public TypesOfConstructor() {
		System.out.println("I am in the constructor");
	}

	public TypesOfConstructor(int a, int b) {
		System.out.println("I am in the parameterized Constructor");
		int c = a * b;
		System.out.println(c);
	}

	public void getData() {
		System.out.println("I am in the method");
	}

	public static void main(String[] args) {

		TypesOfConstructor cons = new TypesOfConstructor();
		TypesOfConstructor par = new TypesOfConstructor(4, 5);
	}
}
