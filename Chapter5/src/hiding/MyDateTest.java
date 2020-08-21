package hiding;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date = new MyDate();
		
		date.setYear(2020);
		date.setMonth(8);
		date.setDay(2);
		
		date.showDate();
		
		MyDate date2 = new MyDate();
		date2.setYear(2002);
		date2.setMonth(9);
		date2.setDay(2);
		
		date.showDate();
	}

}