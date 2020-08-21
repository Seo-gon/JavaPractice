package atm;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		boolean isValid = true; // while구문을 종료 및 실행시키기 위해 설정

		ArrayList customerInfo = new ArrayList();

		Scanner sc = new Scanner(System.in);

		// While - if 구문
		while (true) {

			while (isValid) {
				// 실행 메뉴
				System.out.println("실행하실 메뉴를 선택하세요.");
				System.out.println("1. 계좌 생성");
				System.out.println("2. 조      회");
				System.out.println("3. 입      금");
				System.out.println("4. 출      금");
				System.out.println("5. 송      금");
				System.out.println("6. 종      료");
				System.out.println("===================");

				int selectService = sc.nextInt();
				// 1.계좌번호 생성하기
				if (selectService == 1) {
					// 정보 입력
					System.out.println("<============= 계좌를 생성합니다. =============>");
					System.out.print("이름을 입력하세요: ");
					String name = sc.next();
					System.out.print("주민등록번호를 입력하세요: ");
					long idNum = sc.nextLong();
					System.out.print("주소를 입력하세요: ");
					String address = sc.next();
					System.out.print("사용하실 계좌번호를 입력하세요: ");
					long accountNum = sc.nextLong();
					System.out.print("입금하실 금액을 입력하세요: ");
					long money = sc.nextLong();
					// id에 생성자 대입
					IDCard id = new IDCard(name, idNum, address);
					// id와 추가정보를 customer생성자에 대입
					Customer customer = new Customer(accountNum, money, id);
					// customer를 customerInfo배열에 대입
					customerInfo.add(customer);
					System.out.println("<============= 계좌가 생성되었습니다. =============>");
				}
				// 2.조회하기
				else if (selectService == 2) {
					System.out.print("조회하실 계좌번호를 입력해주세요: ");
					// 조회할 계좌번호 입력받음
					long accountNum = sc.nextLong();
					// 배열 customerInfo의 크기만큼 반복실행
					for (int i = 0; i < customerInfo.size(); i++) {
						// i번째 index에 해당하는 값을 Customer로 형변환을 하여 Customer a에 대입
						Customer a = (Customer) customerInfo.get(i);
						// 위의 인덱스 값중 만약 a의 계좌번호값과 입력한 계좌번호값이 일치하면, 계좌에 관한 정보를 출력
						if (a.getAccountNum() == accountNum) {
							a.showAccountInfo();
							break;
						} else { // 일치하는 정보가 없을 시 "Error"출력
							System.out.println("======");
							System.out.println("Error");
							System.out.println("======");
						}
					}
				}
				// 3.입금하기
				else if (selectService == 3) {
					// 입금할 계좌 입력받음
					System.out.println("입금하실 계좌를 입력해 주세요: ");
					long accountNum = sc.nextLong();
					// 입금액 입력 받음
					System.out.println("입금하실 금액을 입력해 주세요: ");
					long money = sc.nextLong();
					// 배열 customerInfo의 크기만큼 반복실행
					for (int i = 0; i < customerInfo.size(); i++) {
						// 위의 인덱스 값에 해당하는 계좌번호값이 일치하면
						if (((Customer) customerInfo.get(i)).getAccountNum() == accountNum) {
							((Customer) customerInfo.get(i))
									.setMoney(((Customer) customerInfo.get(i)).getMoney() + money);
							System.out.println(((Customer) customerInfo.get(i)).getAccountNum() + "계좌의 잔액은"
									+ ((Customer) customerInfo.get(i)).getMoney() + "원 입니다.");
							break;
						} else { // 일치하는 정보가 없을 시 "Error"출력
							System.out.println("======");
							System.out.println("Error");
							System.out.println("======");
						}
					}
				}
				// 4.출금하기
				else if (selectService == 4) {
					// 출금할 계좌 입력받음
					System.out.println("출금하실 계좌를 입력해 주세요: ");
					long accountNum = sc.nextLong();
					// 출금액 입력 받음
					System.out.println("출금하실 금액을 입력해 주세요: ");
					long money = sc.nextLong();
					// 배열 customerInfo의 크기만큼 반복실행
					for (int i = 0; i < customerInfo.size(); i++) {
						// 위의 인덱스 값에 해당하는 계좌번호값이 일치하면
						if (((Customer) customerInfo.get(i)).getAccountNum() == accountNum) {
							((Customer) customerInfo.get(i))
									.setMoney(((Customer) customerInfo.get(i)).getMoney() - money);
							System.out.println(((Customer) customerInfo.get(i)).getAccountNum() + "계좌의 잔액은"
									+ ((Customer) customerInfo.get(i)).getMoney() + "원 입니다.");
							break;
						} else { // 일치하는 정보가 없을 시 "Error"출력
							System.out.println("======");
							System.out.println("Error");
							System.out.println("======");
						}
					}
				}
				// 5.송금하기
				else if (selectService == 5) {
					// 송금할 계좌 입력
					System.out.println("송금할 계좌를 입력해 주세요: ");
					long accountNumM = sc.nextLong();
					// 입금할 계좌 입력
					System.out.println("입금받을 계좌를 입력해 주세요: ");
					long accountNumP = sc.nextLong();
					// 송금할 금액 입력
					System.out.println("송금하실 금액을 입력해 주세요: ");
					long money = sc.nextLong();
					for (int i = 0; i < customerInfo.size(); i++) {
						// 위의 인덱스 값에 해당하는 계좌번호값이 일치하면
						for (int j = 0; j < customerInfo.size(); j++) {
							// 위의 인덱스 값에 해당하는 계좌번호값이 일치하면
							if (((Customer) customerInfo.get(i)).getAccountNum() == accountNumM) {
								((Customer) customerInfo.get(i))
										.setMoney(((Customer) customerInfo.get(i)).getMoney() - money);
								System.out.println(((Customer) customerInfo.get(i)).getAccountNum() + "계좌의 잔액은"
										+ ((Customer) customerInfo.get(i)).getMoney() + "원 입니다.");
								break;
							} else if (((Customer) customerInfo.get(j)).getAccountNum() == accountNumP) {
								((Customer) customerInfo.get(j))
										.setMoney(((Customer) customerInfo.get(j)).getMoney() + money);
								System.out
										.println(((Customer) customerInfo.get(j)).getAccountNum() + "계좌에 송금이 완료되었습니다.");
								break;
							} else { // 일치하는 정보가 없을 시 "Error"출력
								System.out.println("======");
								System.out.println("Error");
								System.out.println("======");
							}
						}
					}
				}

				// 6.종료
				else {
					isValid = false; // isValid값을 false로 설정함으로써 while구문에서 빠져나간다.
				}

			}
			// 종료 후 재실행
			System.out.println("다시 실행하시려면 true를 입력해주세요.");
			isValid = sc.nextBoolean(); // true를 입력하면 하위의 while(isVaild)값이 true로 설정되어 재실행 됨
			System.out.println("===================");
		}

	}

	/*
	 * System.out.println(id.getName() + "님의 주민번호는 " + id.getIdNum() + "이고 주소는 " +
	 * id.getAddress() + "입니다."); System.out.println(customer.getIdCard().getName()
	 * + "님의 주민번호는 " + customer.getIdCard().getIdNum() + "이고 주소는 " +
	 * customer.getIdCard().getAddress() + "입니다.");
	 * System.out.println(customer.getAcountNum() + "계좌의 잔액은 " + customer.getMoney()
	 * + "원 입니다."); System.out.println("======================================");
	 * System.out.println(customer.getIdCard().getName());
	 * System.out.println(customer.getIdCard().getIdNum());
	 * System.out.println(customer.getIdCard().getAddress());
	 * System.out.println(customer.getAcountNum());
	 * System.out.println(customer.getMoney()); System.out.println(idCardSeo);
	 * 
	 * Customer customerSeo = new Customer(1111111111, 40000, new IDCard("서재곤", 1,
	 * "대구광역시 달서구 상인동")); Customer customerJang = new Customer(1111111112, 60000,
	 * new IDCard("장모씨", 2, "서울특별시 송파구 가락동"));
	 * 
	 * long moneyS = customerSeo.getMoney(); System.out.println(moneyS + "원");
	 * System.out.println(customerSeo.getMoney() + "원"); System.out.println(new
	 * Customer(1111111111, 40000, new IDCard("서재곤", 1, "대구광역시 달서구 상인동")).getMoney()
	 * + "원"); //정보의 중복. new로 새로운 생성자를 가져옴. 같은 정보가 아님
	 * 
	 * customerSeo.showCustomerInfo();
	 * System.out.println("==========================================");
	 * customerJang.showCustomerInfo(); System.out.println(customerSeo);
	 * System.out.println(customerJang);
	 */

}