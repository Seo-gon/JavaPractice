package Condition;

public class WhileExam {

	public static void main(String[] args) {

		int i = 0;
		
		while(i < 9) {
			++i;
			System.out.print(i);
			if(i%3 == 0) {
				System.out.println();
			}
		}
	}

}
