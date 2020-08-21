//package loopExam;
//
//public class BreakContinue {
//
//	public static void main(String[] args) {
//
//		int sum = 0;
//		int num;
//		
//		for(num = 1; sum <= 100; num++) {
//			sum += num;
//			if( sum >= 100 ) {
//				break;
//			}
//		}
//		System.out.println(sum);
//		System.out.println(num);
//	}
//
//}

//package loopExam;
//
//public class BreakContinue {
//
//	public static void main(String[] args) {
//
//		int num;
//		
//		for(num = 1; num <= 100; num++) {
//			
//			if( (num % 3) != 0 ) {
//				continue;
//			}
//			System.out.println(num);
//		}
//		
//	}
//
//}

package loopExam;

public class BreakContinue {

	public static void main(String[] args) {
		
		int dan;
		int count;
		
		for(dan = 2; dan < 10; dan++) {
			if ((dan % 2) != 0) {
				continue;
			}
			for(count = 1; count < 10; count++) {
				if (count > dan) {
					break;
				}
				System.out.println(dan + "X" + count + "=" + dan*count);
			}
			System.out.println();
		}
		
	}

}