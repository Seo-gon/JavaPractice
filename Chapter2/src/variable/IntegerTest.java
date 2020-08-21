package variable;

public class IntegerTest {

	public static void main(String[] args) {
		
		byte num1 = 127;
		System.out.println(num1);
		num1 = -128;
		System.out.println(num1);
		
		int num2 = 1234567899;
		long num3 = 1234567899999L; // long으로 정의해도 int인 4byte안에 숫자를 저장하려한다. 숫자 뒤에 L(권장)이나 l을 입력함으로 long으로 숫자를 취급하도록 한다.
		
		System.out.println(num2);
		System.out.println(num3);
	}

}
