//package loopExam;
//
//public class whileExam {
//
//	public static void main(String[] args) {
//
//		int num = 1;
//		int sum = 0;
//
//		while (num <= 10) {
//			sum += num;
//			num++;
//		}
//		System.out.println(sum);
//		System.out.println(num);
//	}
//}

package loopExam;

public class whileExam {

	public static void main(String[] args) {

		int num = 0;
		int sum = 0;

		while (num <= 100) {
			sum += num;
			num += 2;
		}
		System.out.println(sum);
		System.out.println(num);
	}
}
