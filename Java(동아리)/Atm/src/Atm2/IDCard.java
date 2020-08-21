package Atm2;

public class IDCard {

	String name;
	String idNum;
	String address;
	
	public IDCard() {}
	
	public IDCard(String name, String idNum, String address) {
		this.name = name;
		this.idNum = idNum;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNum() {
		return idNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}