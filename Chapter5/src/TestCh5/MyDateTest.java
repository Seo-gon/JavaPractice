package TestCh5;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate(2, 9, 1998);
		MyDate date2 = new MyDate(31, 9, 2020);
		MyDate date3 = new MyDate(30, 9, 202020);
		
		date.showDate();
		System.out.println(date.isValid());
		
		date2.showDate();
		System.out.println(date2.isValid());
		
		date3.showDate();
		System.out.println(date3.isValid());
	}
}
