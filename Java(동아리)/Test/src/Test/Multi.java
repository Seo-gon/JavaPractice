package Test;

import java.util.Scanner;

public class Multi {

	public static int calcMulti(int numA, int numB) {
		int result = 0;
		result = numA * numB;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		int total = calcMulti(n1, n2);
		System.out.println(total);
	}
}