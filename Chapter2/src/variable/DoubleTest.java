//package variable;
//
//public class DoubleTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		float num = 3.14f;   //f�� ������������� Double������ �Էµ�
//				System.out.println(num);
//				
//		double num2 = 3.14;  //double ����
//				System.out.println(num2);
//	}
//
//}

package variable;

public class DoubleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num = 1;
		
		for(int i = 0; i < 10000; i++) {
			num += 0.1;
		}
		System.out.print(num);
	}
}