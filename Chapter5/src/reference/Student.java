package reference;

public class Student {

	int studentId;
	String studentName;

	Subject korea;
	Subject math;
	Subject eng;
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
		eng = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void setEngSubject(String name, int score) {
		eng.subjectName = name;
		eng.score = score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score + eng.score;
		System.out.println(studentName + "ÇÐ»ýÀÇ ÃÑÁ¡: " + total);
		int avg = (korea.score + math.score + eng.score) / 3;
		System.out.println(studentName + "ÇÐ»ýÀÇ ÃÑÁ¡: " + avg);
	}
}
