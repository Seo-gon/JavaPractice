//package loopExam;
//
//public class Test {
//
//	public static void main(String[] args) {
//		
//		char operator = '+';
//		int num1 = 10;
//		int num2 = 5;
//		int result = 0;
//		
//		if(operator == '+') {
//			result = num1 + num2;
//		}
//		else if(operator == '-') {
//			result = num1 - num2;
//		}
//		else if(operator == '*') {
//			result = num1 * num2;
//		}
//		else if(operator == '/') {
//			result = num1 / num2;
//		}
//		else {
//			System.out.println("Error�Դϴ�.");
//			return;
//		}
//		System.out.println("�����: " + result);
//		
//	}
//
//}

package loopExam;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out.println("Ȧ�� ���� �Է��ϼ���: ");
		Scanner scanner = new Scanner(System.in);
		int line = scanner.nextInt();
		int space = line / 2 + 1;
		int start = 1;

		for (int i = 0; i <= line; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < start; j++) {
				System.out.print('*');
			}
			for (int j = 0; j < space; j++) {
				System.out.print(' ');
			}
			
			if(i < line/2) {
				space -= 1;
				start += 2;
			}
			else {
				space += 1;
				start -= 2;
			}
			System.out.println();
		}
	}
}