package array;

public class BookArrayTest {

	public static void main(String[] args) {

		BookEx[] library = new BookEx[5];

		library[0] = new BookEx("�¹���1", "������");
		library[1] = new BookEx("�¹���2", "������");
		library[2] = new BookEx("�¹���3", "������");
		library[3] = new BookEx("�¹���4", "������");
		library[4] = new BookEx("�¹���5", "������");

		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]); // �ּҸ� ����������
			library[i].showBookInfo();
		}
	}
}
