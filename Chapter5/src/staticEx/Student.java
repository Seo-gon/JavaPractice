package staticEx;

public class Student {

	private static int serialNum = 1000;
	private int studentId;
	public String studentName;
	public String address;

	public Student(String name) {
		studentName = name;
		serialNum++;
		studentId = serialNum;
	}

	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		address = "�ּ� ����";
		serialNum++;
		studentId = serialNum;
	}

	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}

	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentId() {
		serialNum++; //
		return studentId;
	}
	
	public static int getSerialNum() {
//		int i = 0;
//		studentName = "Seo"; //static�����ȿ��� �ν��Ͻ��� ������ �� ����. static�� �ν��Ͻ��� ������ ������� �����̱� ����
		
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
}