package practice_13_4;
import java.io.*;
import java.util.Scanner;

public class FileWriterTest1 {
	public static void main(String args[]) throws Exception {
		Scanner stdin = new Scanner(System.in);
		String source = "����־�� ��¼�� \n" + "������ �����\n" + "�� ���ϴ� �ž�\n";
		char input[] = new char[source.length()];
		source.getChars(0, source.length(), input, 0);
		System.out.print("���ϸ��� �Է��ϼ��� : ");
		String s = stdin.next();
		FileWriter fw = new FileWriter(s);
		fw.write(input);
		fw.close();
		System.out.print(s + "������ �����Ǿ����ϴ�.");
	}
}
