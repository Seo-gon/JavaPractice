package Atm2;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String idNum = sc.next();
		String address = sc.next();
		
		IDCard person = new IDCard(name, idNum, address);

	}
}

//// 방법1
//IDCard person1_idCard = new IDCard("서재곤", "98-1", "상인동");
//Account person1_account = new Account(1, "우리은행", person1_idCard);
//
//// 방법2
//Account person2_account = new Account(2, "하나은행", new IDCard("정진욱", "96-1", "내당동"));
//
//System.out.println(person1_account.getAccountNum() + " " + person1_account.getBankName() + " " +
//					person1_account.getIdCard().getName() + " " + person1_account.getIdCard().getIdNum() + " " +
//					person1_account.getIdCard().getAddress());
//
//System.out.println(person2_account.getAccountNum() + " " + person2_account.getBankName() + " " +
//		person2_account.getIdCard().getName() + " " + person2_account.getIdCard().getIdNum() + " " +
//		person2_account.getIdCard().getAddress());