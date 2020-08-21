package ch6Test;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentSeo = new Student(1001, "Seo");
		
		studentSeo.addSubject("국어", 100);
		studentSeo.addSubject("수학", 90);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 90);
		studentKim.addSubject("영어", 80);
		
		studentSeo.showStudentInfo();
		System.out.println("====================================");
		studentKim.showStudentInfo();
	}

}

