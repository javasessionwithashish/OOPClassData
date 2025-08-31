package chapter4;

public class EncapsulationExample {
	
	private int s_id=4;
	private String s_name;
	
	
	private String fname;
	
	private int phoneNumber;
	
	private String address;
	
	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public int getS_id() {
		return s_id;
	}
	
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	
	
	
	
	
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	
	
	

}
