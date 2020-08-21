package RandomEx;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		for(int i = 0; i <= 5; i++) {
			int rand = (int) (Math.random()*100)+1;
			System.out.println((i+1) + "번째는: " + rand + "입니다.");
		}
	}
}
