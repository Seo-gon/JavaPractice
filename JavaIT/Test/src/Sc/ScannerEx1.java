package Sc;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		
		System.out.println("�̸�, ����, ����, Ű�� ��ĭ���� �и��Ͽ� �Է��ϼ���");

		Scanner scanner = new Scanner(System.in);
		String name = scanner.next(); 
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		String city = scanner.next(); 
		System.out.println("����� ��� ���ô� " + city + "�Դϴ�.");
		int age = scanner.nextInt(); 
		System.out.println("����� ���̴� " + age + "���Դϴ�.");
		double weight = scanner.nextDouble(); 
		System.out.println("����� Ű�� " + weight + "kg�Դϴ�.");

		scanner.close();

	}
}
