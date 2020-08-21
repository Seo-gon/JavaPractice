package staticEx;

public class StudentIdTest {

	public static void main(String[] args) {
		
		Student studentSeo = new Student("Seo");
		System.out.println(Student.getSerialNum()); //클래스 이름으로 참조하여 사용하는 매서드
		
		Student studentKim = new Student("Kim");
//		System.out.println(studentKim.serialNum);
//		System.out.println(Student.serialNum);
		
		System.out.println(studentSeo.getStudentId());
		System.out.println(studentKim.getStudentId());
	}
}

//package staticEx;
//
//public class StudentIdTest {
//
//	public static void main(String[] args) {
//		
////		Student studentSeo = new Student("Seo");
//		System.out.println(Student.getSerialNum());  //인스턴스의 생성과는 상관없는 변수가 static, class매서드라고도 한다
//		
////		Student studentKim = new Student("Kim");
//		System.out.println(Student.getSerialNum());
////		System.out.println(Student.serialNum);
//		
////		System.out.println(studentSeo.getStudentId());
////		System.out.println(studentKim.getStudentId());
//	}
//}

