package Inheritance;

public class lec279_childClassDemo extends lec279_parentClass {

	public void engine()
	{
		System.out.println("new generation engine");
	}
	
	public void colour()
	{
		System.out.println("Vehicle Colour is "+ colour);
	}
	
	public void audioSystem()
	{
		System.out.println("enhance audio sysytem");
	}
	
	public static void main(String[] args) {
		
		lec279_childClassDemo child = new lec279_childClassDemo();
		child.colour();
		child.breaks();
		child.audioSystem();
	}
}
