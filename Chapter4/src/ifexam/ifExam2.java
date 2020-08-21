//package ifexam;
//
//import java.util.Scanner;
//
//public class ifExam2 {
//
//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		
//		int age = 10;
//		
//		int charge = 0;
//		
//		if( age < 8 ) {
//			charge = 500;
//			System.out.println("미취학 아동");
//		}
//		else if( age < 14 ) {
//			charge = 980;
//			System.out.println("초등학생");
//		}
//		else if( age < 20 ) {
//			charge = 1250;
//			System.out.println("중/고등학생");
//		}
//		else {
//			charge = 1500;
//			System.out.println("성인");
//		}
//		System.out.println("나이: " + age + "세");
//		System.out.println("요금: " + charge + "원");
//	}
//
//}

//package ifexam;
//
//import java.util.Scanner;
//
//public class ifExam2 {
//
//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);  //Ctrl + Shift + o
//		int score = scanner.nextInt();
//		char grade;
//		
//		
//		
//		if( score >= 90 ) {
//			grade = 'A';
//		}
//		else if( score >= 80 ) {
//			grade = 'B';
//		}
//		else if( score >= 70 ) {
//			grade = 'C';
//		}
//		else if( score >= 60 ) {
//			grade = 'D';
//		}
//		else {
//			grade = 'F';
//		}
//		System.out.println("점수: " + score + "점");
//		System.out.println("학점: " + grade);
//	}
//
//}

//package ifexam;
//
//public class ifExam2 {
//
//	public static void main(String[] args) {
//
//		
//		int score = 100;
//		char grade;
//		
//		
//		
//		if( score >= 90 ) {
//			grade = 'A';
//		}
//		else if( score >= 80 ) {
//			grade = 'B';
//		}
//		else if( score >= 70 ) {
//			grade = 'C';
//		}
//		else if( score >= 60 ) {
//			grade = 'D';
//		}
//		else {
//			grade = 'F';
//		}
//		System.out.println("점수: " + score + "점");
//		System.out.println("학점: " + grade);
//	}
//
//}

//package ifexam;
//
//public class ifExam2 {
//
//	public static void main(String[] args) {
//
//		
//		int a = 10;
//		int b = 20;
//		
//		int max;
//		
//		max = ( a > b ) ? a : b;
//		System.out.println(max);
//	}
//
//}