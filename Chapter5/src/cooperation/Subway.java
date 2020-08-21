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
		System.out.println(lineNum + "�� ����ö�� �°� ���� " + passengerCount + "�� �̰�, ������ " + income + "�� �Դϴ�.");
	}
	
}
