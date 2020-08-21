package array;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); // <>�ȿ� ���ü�� �������� ���ָ� ��. ������� ������ �ƹ��ڷ����̳� ��밡��. �����ϴ� ���� ����.

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
		
		for( Object s: list2 ) { //ArrayList�� ��üŸ���� ������� ������ Object�� �����ȴ�.
			System.out.println(s);
		}
	}

}
