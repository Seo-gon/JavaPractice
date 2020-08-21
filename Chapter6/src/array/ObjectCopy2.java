package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		
		BookEx[] library = new BookEx[5];
		BookEx[] copyLibrary = new BookEx[5];

		library[0] = new BookEx("태백산맥1", "조정래");
		library[1] = new BookEx("태백산맥2", "조정래");
		library[2] = new BookEx("태백산맥3", "조정래");
		library[3] = new BookEx("태백산맥4", "조정래");
		library[4] = new BookEx("태백산맥5", "조정래");
		
		copyLibrary[0] = new BookEx();
		copyLibrary[1] = new BookEx();
		copyLibrary[2] = new BookEx();
		copyLibrary[3] = new BookEx();
		copyLibrary[4] = new BookEx();
		
		for(int i = 0; i < library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
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
