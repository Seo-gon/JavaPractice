package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int[] arr2 = new int[20];
		int total = 0;
		
		double[] dArr = new double[5];
		double count = 0;
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		dArr[3] = 4.1;
		dArr[4] = 5.1;
		double total2 = 1;
		double total3 = 1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] += i + 1;
			System.out.println(arr[i]);
		}
		System.out.println();

		for (int k = 0; k < arr.length; k++) {
			total += arr[k];
		}
		System.out.println(total);
		System.out.println();

		for (int j = 0, num = 1; j < arr2.length; j++, num++) {
			arr2[j] = num;
			System.out.println(arr2[j]);
		}
		System.out.println();
		
		for(int m = 0; m < count; m++) {
			total2 *= dArr[m];
		}
		System.out.println(total2);
		
		for(int n = 0; n < dArr.length; n++) {
			total3 *= dArr[n];
		}
		System.out.println(total3);
	}
}
