package AbstractClasses;

public class childEmirites extends parentAirCraft {

	public static void main(String[] args) {

		childEmirites child = new childEmirites();
		child.engine();
		child.safetyGuideLines();
		child.sizeOfAirCraft();
		child.bodyColor();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("body color should be red");
	}
}
