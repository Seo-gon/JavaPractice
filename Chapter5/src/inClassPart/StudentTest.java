package inClassPart;

public class StudentTest {

public static void main(String[] args) {
		
		Student studentSeo = new Student();
		studentSeo.studentName = "�����";
		studentSeo.address = "�뱸������ �޼��� ���ε�";
		
		studentSeo.showStudentInfo();
		
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.studentId = 5450003;
		studentLee.address = "����� �������� ���ǵ���";
		
		Student studentKim = new Student();
		studentKim.studentName = "�����";
		studentKim.studentId = 5450002;
		studentKim.address = "����� ���ı� ������";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		System.out.println(studentSeo);
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
	
}
