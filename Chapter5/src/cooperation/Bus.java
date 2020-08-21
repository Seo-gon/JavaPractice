package cooperation;

public class Bus {

	int busNum;
	int passengerCount;
	int income;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int income) {
		this.income += income;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNum + "�� ������ �°� ���� " + passengerCount + "�� �̰�, ������ " + income + "�� �Դϴ�.");
	}
}
