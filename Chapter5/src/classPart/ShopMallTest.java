package classPart;

public class ShopMallTest {

	public static void main(String[] args) {

		ShopMall shopMall = new ShopMall();
		shopMall.num = "201907210001";
		shopMall.id = "abc123";
		shopMall.date = "2019�� 7�� 21��";
		shopMall.name = "ȫ���";
		shopMall.itNum = "PD0345-12";
		shopMall.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ: " + shopMall.num);
		System.out.println("�ֹ��� ���̵�: " + shopMall.id);
		System.out.println("�ֹ� ��¥: " + shopMall.date);
		System.out.println("�ֹ��� �̸�: " + shopMall.name);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + shopMall.itNum);
		System.out.println("��� �ּ�: " + shopMall.address);
	}

}
