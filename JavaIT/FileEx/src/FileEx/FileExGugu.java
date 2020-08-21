package FileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExGugu {

	public static void main(String[] args) {
		File file = new File("gugudan.txt");
		try {
			FileWriter fw = new FileWriter(file);
			int i = 2;
			int j = 1;
			while (i < 10) {
				while (j < 10) {
					fw.append(j + "X" + i + "=" + (i * j) + "\t");
					j++;
				}
				j = 1;
				fw.append("\n");
				i++;
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File Error");
		}
	}
}