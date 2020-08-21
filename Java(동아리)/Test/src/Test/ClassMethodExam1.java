package Test;

import java.util.Scanner;

public class ClassMethodExam1 {
	//접근 제한자  반환타입  메소드명  (파라미터/매개변수목록)
	public void add(int a, int b) {
		System.out.println("덧셈 함수의 결과는: " + (a + b));
	}

	public void minus(int a, int b) {
		System.out.println("뺄셈 함수의 결과는: " + (a - b));
	}
	
	public void multipl(int a, int b) {
		System.out.println("곱셈 함수의 결과는: " + (a * b));
	}

	public void divis(int a, int b) {
		System.out.println("나눗셈 함수의 결과는: " + (a / b));
	}


	public static void main(String[] args) {
		ClassMethodExam1 s = new ClassMethodExam1();

		System.out.println("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		s.add(a, b);
		s.minus(a, b);
		s.multipl(a, b);
		s.divis(a, b);

//		while (true) {
//			System.out.println("숫자를 입력하세요: 1.덧셈  2.뺄셈  3.나눗셈  4.곱셈");
//			Scanner sc2 = new Scanner(System.in);
//
//			int c = sc2.nextInt();
//			switch (c) {
//			case 1:
//				a += 1;
//				System.out.println("덧셈을 입력하면 받은 값에 1을 더합니다." + a);
//				break;
//
//			case 2:
//				a -= 1;
//				System.out.println("뺄셈을 입력하면 받은 값에 1을 뺍니다." + a);
//				break;
//
//			case 3:
//				a /= 2;
//				System.out.println("나눗셈을 입력하면 받은 값에 2로 나눕니다." + a);
//				break;
//
//			default:
//				a *= 2;
//				System.out.println("곱셈을 입력하면 받은 값에 2를 곱합니다." + a);
//				break;
//			}
//
//		}

	}

}
