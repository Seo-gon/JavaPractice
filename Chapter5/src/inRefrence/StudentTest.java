package inRefrence;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentSeo = new Student(100, "서재곤");
		studentSeo.setKorea("국어", 100);
		studentSeo.setMath("수학", 100);
		studentSeo.setEng("영어", 100);
		
		Student studentKim = new Student(101, "김민주");
		studentKim.setKorea("국어", 100);
		studentKim.setMath("수학", 100);
		studentKim.setEng("영어", 100);
		
		studentSeo.showStudentInfo();
		studentKim.showStudentInfo();
	}
}
