package classPart;

public class ShopMallTest {

	public static void main(String[] args) {

		ShopMall shopMall = new ShopMall();
		shopMall.num = "201907210001";
		shopMall.id = "abc123";
		shopMall.date = "2019년 7월 21일";
		shopMall.name = "홍길순";
		shopMall.itNum = "PD0345-12";
		shopMall.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호: " + shopMall.num);
		System.out.println("주문자 아이디: " + shopMall.id);
		System.out.println("주문 날짜: " + shopMall.date);
		System.out.println("주문자 이름: " + shopMall.name);
		System.out.println("주문 상품 번호: " + shopMall.itNum);
		System.out.println("배송 주소: " + shopMall.address);
	}

}
