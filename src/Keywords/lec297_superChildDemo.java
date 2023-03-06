package Keywords;

public class lec297_superChildDemo extends lec297_superParentDemo {

	String name = "Testing";

//	public childDemo()
//	{
//		super(); //this should be always at the first line
//		System.out.println("I am from child class constructor");
//	}
	
	
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData()
	{
		super.getData();
		System.out.println("I am from child class");
	}
	
	public static void main(String[] args) {

		lec297_superChildDemo cd = new lec297_superChildDemo();
		cd.getStringData();
		cd.getData();		
	}
}
