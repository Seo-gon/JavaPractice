package ScannerEx;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월(1~12)을 입력하세요: ");
		int month = sc.nextInt();
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("봄 입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("여름 입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("가을 입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울 입니다.");
			break;
		default:
			System.out.println("Error");
		}
		sc.close();
	}
}
