package report5;
import java.util.Scanner;


public class report5 {
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("나의 애완동물 : 1.개 2.고양이 3.햄스터 (선택)");
		int num = stdin.nextInt();
		if (num == 1)
			Animal ma = new Dog();
		
		
	}
}
