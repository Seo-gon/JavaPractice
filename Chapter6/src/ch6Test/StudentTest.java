package ch6Test;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentSeo = new Student(1001, "Seo");
		
		studentSeo.addSubject("����", 100);
		studentSeo.addSubject("����", 90);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("����", 100);
		studentKim.addSubject("����", 90);
		studentKim.addSubject("����", 80);
		
		studentSeo.showStudentInfo();
		System.out.println("====================================");
		studentKim.showStudentInfo();
	}

}

