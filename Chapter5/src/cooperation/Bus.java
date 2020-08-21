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
		System.out.println(busNum + "번 버스의 승객 수는 " + passengerCount + "명 이고, 수입은 " + income + "원 입니다.");
	}
}
