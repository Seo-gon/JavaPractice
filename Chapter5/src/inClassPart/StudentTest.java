package inClassPart;

public class StudentTest {

public static void main(String[] args) {
		
		Student studentSeo = new Student();
		studentSeo.studentName = "서재곤";
		studentSeo.address = "대구광역시 달서구 상인동";
		
		studentSeo.showStudentInfo();
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentId = 5450003;
		studentLee.address = "서울시 영등포구 여의도동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김민주";
		studentKim.studentId = 5450002;
		studentKim.address = "서울시 송파구 가락동";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		System.out.println(studentSeo);
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
	
}
