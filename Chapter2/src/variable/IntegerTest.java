package variable;

public class IntegerTest {

	public static void main(String[] args) {
		
		byte num1 = 127;
		System.out.println(num1);
		num1 = -128;
		System.out.println(num1);
		
		int num2 = 1234567899;
		long num3 = 1234567899999L; // long���� �����ص� int�� 4byte�ȿ� ���ڸ� �����Ϸ��Ѵ�. ���� �ڿ� L(����)�̳� l�� �Է������� long���� ���ڸ� ����ϵ��� �Ѵ�.
		
		System.out.println(num2);
		System.out.println(num3);
	}

}
