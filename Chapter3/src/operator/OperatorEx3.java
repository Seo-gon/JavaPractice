//package operator;
//
//public class OperatorEx3 {
//
//	public static void main(String[] args) {
//
//		int score = 100;
//		
//		System.out.println(++score);
//		System.out.println(score++);
//		System.out.println(score);
//		
//		System.out.println(--score);
//		System.out.println(score--);
//		System.out.println(score);
//	}
//
//}


package operator;

public class OperatorEx3 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		
		boolean value = ((num1 = num1 + 10) < 10 && (num2 += 2) < 10);
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(value);
		
		int num3 = 20;
		int num4 = 4;
		
		boolean value1 = ((num1 = num1 + 10) < 10 || (num2 += 2) < 10);
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(value1);
		
		int num5 = 10;
		int num6 = 30;
		
		int max = (num5 > num6) ? num5 : num6;
		System.out.println(max);
	}

}
