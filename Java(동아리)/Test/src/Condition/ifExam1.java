package Condition;

import java.util.Scanner;

public class ifExam1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		String student1 = scanner.next();
		String student2 = scanner2.next();
		
		if(student1 == student2) {
			System.out.println("같은 학생 입니다.");
		}
		else if(student1 != student2) {
			System.out.println("다른 학생 입니다.");
		}
		else {
			System.out.println("Error");
		}
	}

}
