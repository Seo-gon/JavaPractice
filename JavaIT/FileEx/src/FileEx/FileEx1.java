package FileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEx1 {

	public static void main(String[] args) { //
		Scanner sc = new Scanner(System.in);
		String text;
		File file = new File("String.txt");
		try {
			FileWriter fw = new FileWriter(file);
			while (true) {
				System.out.print(">>");
				text = sc.nextLine();
				if (text.equals("Exit")) {
					break;
				}
				fw.append(text + "\n");
				fw.append(String.valueOf(text) + "\n"); //String�� ����Ÿ������ ����
			}
			fw.close();
			System.out.println("������ �����Ǿ����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File Error");
		}
	}
}