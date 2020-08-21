package TestCh5;

public class Person {
	String name;
	int money;
	
	Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.brewing(4000);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님이 주문하신 메뉴의 가격은 " + money + "원 입니다." + message);
		}
	}
	
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.brewing(4500);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님이 주문하신 메뉴의 가격은 " + money + "원 입니다." + message);
		}
	}
}
