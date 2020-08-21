package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		BookEx[] library = new BookEx[5];
		BookEx[] copyLibrary = new BookEx[5];

		library[0] = new BookEx("�¹���1", "������");
		library[1] = new BookEx("�¹���2", "������");
		library[2] = new BookEx("�¹���3", "������");
		library[3] = new BookEx("�¹���4", "������");
		library[4] = new BookEx("�¹���5", "������");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
//		for(BookEx book : copyLibrary) {
//			book.showBookInfo();
//		}
		
		library[0].setTitle("����");
		library[0].setAuthor("�ڿϼ�");
		
		for( BookEx book2: library) {
			book2.showBookInfo();
		}
		
		System.out.println("===========================");
		
		for( BookEx book2: copyLibrary) {
			book2.showBookInfo();
		}
	}
}
