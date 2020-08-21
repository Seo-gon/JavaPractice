package thisEx;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personNoname = new Person();
		personNoname.showInfo();
		
		Person personSeo = new Person("Seo", 23);
		personSeo.showInfo();
		System.out.println(personSeo);
		
		Person s = personSeo.getSelf();
		System.out.println(s);
	}
}
