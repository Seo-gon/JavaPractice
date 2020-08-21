package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		
		int num1 = 0B00001010; //10
		int num2 = 0b00000101; //5
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		
		System.out.println(num2 << 1);
		System.out.println(num2 << 2);
		System.out.println(num2 << 3);
		System.out.println(num2 >> 1);
		System.out.println(num2 << 2);
		System.out.println(num2 << 3); // 대입연산자를 사용하지 않았기 때문에, num2의 값은 변하지 않음.
	}

}
