package Statement;

import java.util.Scanner;

public class Equal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Exit�� �Է��ϸ� �����մϴ�.");
		
		while(true) {
			System.out.print(">>");
			String text = sc.next();
			if(text.equals("Exit")) {
				break;
			}
		}
		System.out.println("�����մϴ�.");
		sc.close();
	}
}