package array;

public class BookArrayTest {

	public static void main(String[] args) {

		BookEx[] library = new BookEx[5];

		library[0] = new BookEx("태백산맥1", "조정래");
		library[1] = new BookEx("태백산맥2", "조정래");
		library[2] = new BookEx("태백산맥3", "조정래");
		library[3] = new BookEx("태백산맥4", "조정래");
		library[4] = new BookEx("태백산맥5", "조정래");

		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]); // 주소를 가지고있음
			library[i].showBookInfo();
		}
	}
}
