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
		address = "주소 없음";
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
//		studentName = "Seo"; //static변수안에서 인스턴스를 생성할 수 없다. static은 인스턴스의 생성과 상관없는 변수이기 때문
		
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
}