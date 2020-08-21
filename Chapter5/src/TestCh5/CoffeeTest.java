package TestCh5;

public class CoffeeTest {

	public static void main(String[] args) {

		Person Seo = new Person("Seo", 40000);
		Person Kim = new Person("Kim", 10000);
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		Seo.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
		Kim.buyBeanCoffee(beanCoffee, 4500);
	}

}
