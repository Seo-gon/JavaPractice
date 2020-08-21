package array;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30, 40, 50 };
		int[] arr2 = {1, 2, 3, 4, 5 };
		
		System.arraycopy(arr1, 0, arr2, 1, 3); //arr1에서 0~3번째 index를 arr2의 1번 index뒤에 복사
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
