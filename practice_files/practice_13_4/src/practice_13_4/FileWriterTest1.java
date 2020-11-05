package practice_13_4;
import java.io.*;
import java.util.Scanner;

public class FileWriterTest1 {
	public static void main(String args[]) throws Exception {
		Scanner stdin = new Scanner(System.in);
		String source = "비어있어야 어쩌구 \n" + "영원히 블라블라\n" + "뭘 원하는 거야\n";
		char input[] = new char[source.length()];
		source.getChars(0, source.length(), input, 0);
		System.out.print("파일명을 입력하세요 : ");
		String s = stdin.next();
		FileWriter fw = new FileWriter(s);
		fw.write(input);
		fw.close();
		System.out.print(s + "파일이 생성되었습니다.");
	}
}
