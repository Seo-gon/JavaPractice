package Condition;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		while(true) {
			System.out.println("숫자를 입력하세요: 1.덧셈  2.뺄셈  3.나눗셈  4.곱셈");
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			switch (a) {
			case 1:
				a += 1;
				System.out.println("덧셈을 입력하면 받은 값에 1을 더합니다." + a);
				break;
				
			case 2:
				a -= 1;
				System.out.println("뺄셈을 입력하면 받은 값에 1을 뺍니다." + a);
				break;
				
			case 3:
				a /= 2;
				System.out.println("나눗셈을 입력하면 받은 값에 2로 나눕니다." + a);
				break;
				
			default: 
				a *= 2;
				System.out.println("곱셈을 입력하면 받은 값에 2를 곱합니다." + a);
				break;
			}
			
		}
		
	}

}