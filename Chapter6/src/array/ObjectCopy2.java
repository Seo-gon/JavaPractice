package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		
		BookEx[] library = new BookEx[5];
		BookEx[] copyLibrary = new BookEx[5];

		library[0] = new BookEx("�¹���1", "������");
		library[1] = new BookEx("�¹���2", "������");
		library[2] = new BookEx("�¹���3", "������");
		library[3] = new BookEx("�¹���4", "������");
		library[4] = new BookEx("�¹���5", "������");
		
		copyLibrary[0] = new BookEx();
		copyLibrary[1] = new BookEx();
		copyLibrary[2] = new BookEx();
		copyLibrary[3] = new BookEx();
		copyLibrary[4] = new BookEx();
		
		for(int i = 0; i < library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
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
