package staticEx;

public class StudentIdTest {

	public static void main(String[] args) {
		
		Student studentSeo = new Student("Seo");
		System.out.println(Student.getSerialNum()); //Ŭ���� �̸����� �����Ͽ� ����ϴ� �ż���
		
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
//		System.out.println(Student.getSerialNum());  //�ν��Ͻ��� �������� ������� ������ static, class�ż����� �Ѵ�
//		
////		Student studentKim = new Student("Kim");
//		System.out.println(Student.getSerialNum());
////		System.out.println(Student.serialNum);
//		
////		System.out.println(studentSeo.getStudentId());
////		System.out.println(studentKim.getStudentId());
//	}
//}

