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
		System.out.println(TaxiNum + "번 택시의 승객 수는 " + passengerCount + "명 이고, 수입은 " + income + "원 입니다.");
	}
}
