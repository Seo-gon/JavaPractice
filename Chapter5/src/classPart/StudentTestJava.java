package classPart;

public class StudentTestJava {

	public static void main(String[] args) {
		
		Student gon = new Student(0, "�����");
//		gon.studentName = "�����";
		gon.address = "�뱸";
		
		gon.showStudentInfo();
		
		Student kim = new Student(100, "�����");
//		kim.studentName = "�����";
//		kim.address = "����";
		
		kim.showStudentInfo();
		
//		System.out.println(gon);
//		System.out.println(kim);
	}
}
