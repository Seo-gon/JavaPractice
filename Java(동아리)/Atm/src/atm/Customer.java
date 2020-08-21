package atm;

public class Customer {

	private long accountNum;
	private long money;
	private IDCard idCard;
	
	public Customer() {}
	
	public Customer(long accountNum, long money, IDCard idCard) {
		this.accountNum = accountNum;
		this.money = money;
		this.idCard = idCard;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public IDCard getIdCard() {
		return idCard;
	}

	public void setIdCard(IDCard idCard) {
		this.idCard = idCard;
	}

	public long getAccountNum() {
		return accountNum;
	}
	
	public void showAccountInfo() {
		System.out.println("========================");
		System.out.println(accountNum + "계좌의 잔액은 " + money + "원 입니다.");
		System.out.println("========================");
	}
}
