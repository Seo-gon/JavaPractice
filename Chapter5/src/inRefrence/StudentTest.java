package inRefrence;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentSeo = new Student(100, "�����");
		studentSeo.setKorea("����", 100);
		studentSeo.setMath("����", 100);
		studentSeo.setEng("����", 100);
		
		Student studentKim = new Student(101, "�����");
		studentKim.setKorea("����", 100);
		studentKim.setMath("����", 100);
		studentKim.setEng("����", 100);
		
		studentSeo.showStudentInfo();
		studentKim.showStudentInfo();
	}
}
