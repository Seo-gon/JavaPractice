package Test;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println("a가 큽니다. a는 " + a +"입니다.");
		}
		else if(b > a) {
			System.out.println("b가 큽니다. b는 " + b +"입니다.");
		}
		else if (a == b) {
			System.out.println("같습니다. a는" + a +" b는"+ b);
		}
	}

}