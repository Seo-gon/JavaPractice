package Test;

public class MultiExam2 {

	public static void calcMulti2(int i, int j) {
		int result = 0;
		for (i = 1; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				result = i * j;
				
				if (result < 10) {
					System.out.print(i + "X" + j + "=0" + result + " ");
				} 
				else {
					System.out.print(i + "X" + j + "=" + result + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		calcMulti2(0, 0);
	}

}