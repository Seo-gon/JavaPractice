package cooperation;

public class Taxi {
	
	int TaxiNum;
	int passengerCount;
	int income;
	
	public Taxi(int TaxiNum) {
		this.TaxiNum = TaxiNum;
	}
	
	public void take(int income) {
		this.income += 10000;
		passengerCount++;
	}
	
	public void showTaxiInfo() {
		System.out.println(TaxiNum + "�� �ý��� �°� ���� " + passengerCount + "�� �̰�, ������ " + income + "�� �Դϴ�.");
	}
}
