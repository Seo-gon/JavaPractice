package variable;

public class ExplicitConversion {

	public static void main(String[] args) {

		int iNum = 1000;
		byte bNum = (byte)iNum; //����� ����ȯ
		System.out.println(bNum); //����� ����ȯ�� ��� ������ �ս��� �߻��ϰ� �Ǿ� ��Ȯ�� ���� ǥ���� �� ����.
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum2 = (int)dNum + (int)fNum; //�Ҽ������ϸ� ���� ������ �� PLUS
		int iNum3 = (int)(dNum + fNum); //���� PLUS�� �� int�� ����ȯ
		System.out.println(iNum2);
		System.out.println(iNum3);
	}

}
