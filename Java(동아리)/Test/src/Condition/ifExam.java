package Condition;

public class ifExam {

	public static void main(String[] args) {

		String student1 = "서재곤";
		String student2 = "서재곤";
		
		if(student1 == student2) {
			System.out.println("같은 학생 입니다.");
		}
		else if(student1 != student2) {
			System.out.println("다른 학생 입니다.");
		}
		else {
			System.out.println("Error");
		}
	}

}
