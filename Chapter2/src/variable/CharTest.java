package variable;

public class CharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A'; //char에는 음수값은 들어갈 수 없음.
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		int i = 66;
		
		System.out.println(i);
		System.out.println((char)i);
		
		char korean = '\uAC00';
		System.out.println(korean);
		System.out.print(korean);
		
		char korean1 = '한';
		System.out.println(korean1);
		System.out.print((int)korean1);
	}

}
