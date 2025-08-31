package chapter4;

import chapter4.EncapsulationExample;

public class EncapsulationTest {
	public static void main(String[] args) {
		
EncapsulationExample e= new EncapsulationExample();

		e.setPhoneNumber(123);
		e.setFname("virinchi");
		
		int phoneNumber=e.getPhoneNumber();
		String fname=e.getFname();
		
		System.out.println(phoneNumber+fname);
		
	}

}
