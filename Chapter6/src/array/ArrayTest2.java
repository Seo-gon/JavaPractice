package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		String[] string = new String[26];
		string[0] = "A";
		string[1] = "B";
		string[2] = "C";
		string[3] = "D";
		string[4] = "E";
		string[5] = "F";
		string[6] = "G";
		string[7] = "H";
		string[8] = "I";
		string[9] = "J";
		string[10] = "K";
		string[11] = "L";
		string[12] = "M";
		string[13] = "N";
		string[14] = "O";
		string[15] = "P";
		string[16] = "Q";
		string[17] = "R";
		string[18] = "S";
		string[19] = "T";
		string[20] = "U";
		string[21] = "V";
		string[22] = "W";
		string[23] = "X";
		string[24] = "Y";
		string[25] = "Z";
		
		for(int j = 0; j < string.length; j++) {
			System.out.println(string[j]);
		}
		System.out.println();
		
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch++;
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
		
//		String[] alphabet = new String[26];
//		String str = 'A'; //ch만 인식? 아스키코드?
//		
//		for(int i = 0; i < alphabet.length; i++) {
//			alphabet[i] = str++;
//			System.out.println(alphabet[i]);
//		}
	}
}
