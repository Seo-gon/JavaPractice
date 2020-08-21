package classPart;

public class StudentTestJava {

	public static void main(String[] args) {
		
		Student gon = new Student(0, "º≠¿Á∞Ô");
//		gon.studentName = "º≠¿Á∞Ô";
		gon.address = "¥Î±∏";
		
		gon.showStudentInfo();
		
		Student kim = new Student(100, "±ËπŒ¡÷");
//		kim.studentName = "±ËπŒ¡÷";
//		kim.address = "º≠øÔ";
		
		kim.showStudentInfo();
		
//		System.out.println(gon);
//		System.out.println(kim);
	}
}
