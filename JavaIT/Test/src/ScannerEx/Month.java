package ScannerEx;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��(1~12)�� �Է��ϼ���: ");
		int month = sc.nextInt();
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("�� �Դϴ�.");
			break;
		case 6: case 7: case 8:
			System.out.println("���� �Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println("���� �Դϴ�.");
			break;
		case 12: case 1: case 2:
			System.out.println("�ܿ� �Դϴ�.");
			break;
		default:
			System.out.println("Error");
		}
		sc.close();
	}
}