package inRefrence;

public class Student {
	
	int studentId;
	String studentName;
	Subject korea;
	Subject math;
	Subject eng;
	
	public Student() {
		korea = new Subject();
		math = new Subject();
		eng = new Subject();
	}
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public void setKorea(String subjectName, int score) {
		korea.setSubjectName(subjectName);
		korea.setScore(score);
	}
	
	public void setMath(String subjectName, int score) {
		math.setSubjectName(subjectName);
		math.setScore(score);
	}
	
	public void setEng(String subjectName, int score) {
		eng.setSubjectName(subjectName);
		eng.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore() + eng.getScore();
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
	
}
