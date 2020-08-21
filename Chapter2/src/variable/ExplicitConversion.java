package variable;

public class ExplicitConversion {

	public static void main(String[] args) {

		int iNum = 1000;
		byte bNum = (byte)iNum; //명시적 형변환
		System.out.println(bNum); //명시적 형변환의 경우 데이터 손실이 발생하게 되어 정확한 값을 표기할 수 없다.
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum2 = (int)dNum + (int)fNum; //소수점이하를 먼저 제거한 후 PLUS
		int iNum3 = (int)(dNum + fNum); //수를 PLUS한 후 int로 형변환
		System.out.println(iNum2);
		System.out.println(iNum3);
	}

}
