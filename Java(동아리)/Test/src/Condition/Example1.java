package Condition;

import java.util.ArrayList;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		ArrayList names = new ArrayList();
		
		//추가
		String name = "서재곤";
		String name1 = "재곤";
		String name2 = "아모르겠다";
		names.add(name);
		names.add(name1);
		names.add(name2);
		
		//검색
		Scanner sc = new Scanner(System.in);
		String searchName = sc.next();
		
		//이름을 받아서 검색
		for(int i = 0; i < names.size(); i++) {
			if(names.get(i).equals(searchName)) {
				System.out.println(searchName + "의 index번호는: " + i);
			}
		}
		sc.close();
	}

}