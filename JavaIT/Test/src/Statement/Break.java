package Statement;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("양수를 입력하세요(종료는 0): ");
			int num = sc.nextInt();
			if (num == 0) {
				break;
			} else if (num < 0) {
				System.out.println(result);
				break;
			}
			result += num;
			System.out.println(result);
			sc.close();
		}
		System.out.println("종료");
	}
}