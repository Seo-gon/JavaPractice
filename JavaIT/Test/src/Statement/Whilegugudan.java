package Statement;

public class Whilegugudan {

	public static void main(String[] args) {

		int i = 2;
		while (i < 10) {
			int j = 1;
			while (j < 10) {
				if ((i * j) > 9) {
					System.out.print(i + "X" + j + "=" + (i * j) + " ");
				} else {
					System.out.print(i + "X" + j + "=0" + (i * j) + " ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
