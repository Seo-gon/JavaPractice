package Test;

import java.util.Scanner;

public class GuguDan {
	
	public static int Multi (int numA, int numB) {
		int result;
		result = numA * numB;
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		int n1 = scanner.nextInt();
		int n2 = scanner2.nextInt();
		int multiResult = Multi(n1, n2);
		System.out.println(multiResult);
	}
}