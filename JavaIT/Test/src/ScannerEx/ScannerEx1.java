package ScannerEx;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		
		System.out.println("�̸�, ����, ����, Ű�� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("����� �̸���" + name + "�Դϴ�.");
		String city = sc.next();
		System.out.println("����� ��� ���ô� " + city + "�Դϴ�.");
		int age = sc.nextInt();
		System.out.println("����� ���̴� " + age + "�� �Դϴ�.");
		double height = sc.nextDouble();
		System.out.println("����� Ű�� " + height + "cm �Դϴ�.");
		
		sc.close();
		
	}
	
}
