package Atm2;

public class Account {

	long accountNum;
	String bankName;
	IDCard idCard;
	
	public Account() {}
	
	public Account(long accountNum, String bankName, IDCard idCard) {
		this.accountNum = accountNum;
		this.bankName = bankName;
		this.idCard = idCard;
	}

	public long getAccountNum() {
		return accountNum;
	}

	public String getBankName() {
		return bankName;
	}

	public IDCard getIdCard() {
		return idCard;
	}

	public void setIdCard(IDCard idCard) {
		this.idCard = idCard;
	}
	
	
}
