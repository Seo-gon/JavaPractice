package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentSeo = new Student(100, "Seo");
		studentSeo.setKoreaSubject("����", 100);
		studentSeo.setMathSubject("����", 95);
		studentSeo.setEngSubject("����", 92);

		Student studentKim = new Student(100, "Kim");
		studentKim.setKoreaSubject("����", 90);
		studentKim.setMathSubject("����", 95);
		studentKim.setEngSubject("����", 85);
		
		studentSeo.showStudentScore();
		studentKim.showStudentScore();
	}

}
