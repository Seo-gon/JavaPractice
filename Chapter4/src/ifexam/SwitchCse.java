//package ifexam;
//
//import java.util.Scanner;
//
//public class SwitchCse {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);  //Ctrl + Shift + o
//		
//		int rank = scanner.nextInt();
//		char medalColor;
//		
//		switch(rank) {
//			case 1:
//				medalColor = 'G';
//				System.out.println("금");
//				break;
//			case 2:
//				medalColor = 'S';
//				System.out.println("은");
//				break;
//			case 3:
//				medalColor = 'B';
//				System.out.println("동");
//				break;
//			default:
//				medalColor = 'N';
//		}
//		System.out.println(rank + "등은" + medalColor + "메달 입니다.");
//	}
//
//}

package ifexam;

import java.util.Scanner;

public class SwitchCse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);  //Ctrl + Shift + o
		
		int month = scanner.nextInt();
		int day = 0;
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 2:
				day = 28;
			case 4: case 6: case 11:
				day = 30;
				break;
			default:
				day = 'N';
		}
		System.out.println(month + "월은" + day + "일 입니다.");
	}

}