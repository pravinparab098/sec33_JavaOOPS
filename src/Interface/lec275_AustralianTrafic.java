package Interface;

public class lec275_AustralianTrafic implements lec275_centralTraffic {

	public static void main(String[] args) {
		
		lec275_centralTraffic ausTraf = new lec275_AustralianTrafic();	
		
		/*
		 * "ausTraf" object helps us to call all the method from the interface class lec275_centralTraffic
		 */
		
		ausTraf.red_STOP();
		ausTraf.Flash_yellow();
		ausTraf.green_GO();
	}
	
	
	@Override
	public void red_STOP() {
		// TODO Auto-generated method stub
		System.out.println("Code To Flash Red Signal");
	}

	@Override
	public void green_GO() {
		// TODO Auto-generated method stub
		System.out.println("Code To Flash Green Signal");
	}

	@Override
	public void Flash_yellow() {
		// TODO Auto-generated method stub
		System.out.println("Code To Flash Yellow Signal");
	}
}
