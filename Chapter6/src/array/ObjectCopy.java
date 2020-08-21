package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		BookEx[] library = new BookEx[5];
		BookEx[] copyLibrary = new BookEx[5];

		library[0] = new BookEx("태백산맥1", "조정래");
		library[1] = new BookEx("태백산맥2", "조정래");
		library[2] = new BookEx("태백산맥3", "조정래");
		library[3] = new BookEx("태백산맥4", "조정래");
		library[4] = new BookEx("태백산맥5", "조정래");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
//		for(BookEx book : copyLibrary) {
//			book.showBookInfo();
//		}
		
		library[0].setTitle("나욱");
		library[0].setAuthor("박완서");
		
		for( BookEx book2: library) {
			book2.showBookInfo();
		}
		
		System.out.println("===========================");
		
		for( BookEx book2: copyLibrary) {
			book2.showBookInfo();
		}
	}
}
