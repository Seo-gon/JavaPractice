package cooperation;

public class Subway {

	int lineNum;
	int passengerCount;
	int income;
	
	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}
	
	public void take(int income) {
		this.income += income;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNum + "번 지하철의 승객 수는 " + passengerCount + "명 이고, 수입은 " + income + "원 입니다.");
	}
	
}
