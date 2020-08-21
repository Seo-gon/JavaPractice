package atm;

public class IDCard {

	private String name;
	private long idNum;
	private String address;
	
	public IDCard() {}
	
	public IDCard(String name, long idNum, String address) {
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

	public long getIdNum() {
		return idNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
