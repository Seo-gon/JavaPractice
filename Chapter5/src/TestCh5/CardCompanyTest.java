package TestCh5;

public class CardCompanyTest {

	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance(); //�̱��� ����
		
		Card myCard = company.createCard(); //�ż��忡�� Car ����
		Card yourCard = company.createCard();
		
		System.out.println(myCard.getCardNum());		//10001 ���
		System.out.println(yourCard.getCardNum());	//10002 ���
	}
}
