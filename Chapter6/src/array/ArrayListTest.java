package array;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); // <>안에 어떤객체를 쓸것인지 써주면 됨. 사용하지 않으면 아무자료형이나 사용가능. 지정하는 것이 좋음.

		list.add("ABC");
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		System.out.println();

		for (String st : list) {
			System.out.println(st);
		}
		System.out.println();

		ArrayList list2 = new ArrayList();

		list2.add("ABC");
		list2.add("AAA");
		list2.add("BBB");
		list2.add("CCC");
		
		for( Object s: list2 ) { //ArrayList에 객체타입을 사용하지 않으면 Object로 설정된다.
			System.out.println(s);
		}
	}

}
