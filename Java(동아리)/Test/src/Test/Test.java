package Test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) { //main + Ctrl + space 자동완성

		Scanner scanner = new Scanner(System.in);

		int A = 0;
		int B = 0;

		while (true) {
			A = scanner.nextInt();
			B = scanner.nextInt();
			if (A == 0 && B == 0) {
				break;
			} else {
				System.out.println(A + B); //sysout + Ctrl + space 자동완성
			}
		}

	}
}
