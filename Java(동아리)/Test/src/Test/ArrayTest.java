package Test;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {

		String[] str = new String[100];
		str[0] = "서재곤";
		str[1] = "서재곤";
		str[2] = "서재곤";
		
		System.out.println(str[0]);
		System.out.println(str[99]);
		
		ArrayList strList = new ArrayList(); //자료형에 상관없이 모두 입력된다.
		strList.add("서");
		strList.add("재곤");
		strList.add("서재곤");
		strList.add("안녕");
		strList.add(1);
		strList.add(3.14);
		System.out.println(strList.get(3));
		System.out.println(strList.get(4));
		System.out.println(strList.get(5));
	}

}