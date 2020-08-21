package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentSeo = new Student(100, "Seo");
		studentSeo.setKoreaSubject("국어", 100);
		studentSeo.setMathSubject("수학", 95);
		studentSeo.setEngSubject("영어", 92);

		Student studentKim = new Student(100, "Kim");
		studentKim.setKoreaSubject("국어", 90);
		studentKim.setMathSubject("수학", 95);
		studentKim.setEngSubject("영어", 85);
		
		studentSeo.showStudentScore();
		studentKim.showStudentScore();
	}

}
