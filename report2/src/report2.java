import java.util.Scanner;

public class report2 {
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("금액을 입력하세요: ");
		int num = stdin.nextInt();
		int m5, m1, c1, b5, b1, s1, l1;
		m5 = num / 50000;
		num %= 50000;
		m1 = num/10000;
		num %= 10000;
		c1 = num/1000;
		num %= 1000;
		b5 = num/500;
		num %= 500;
		b1 = num/100;
		num %= 100;
		s1 = num/10;
		num %= 10;
		l1 = num;
		
		System.out.println("오만원 : "+ m5 + "장");
		System.out.println("만원 : "+ m1 +"장");
		System.out.println("천원 : "+ c1 +"장");
		System.out.println("오백원 : "+ b5 +"개");
		System.out.println("백원 : "+ b1 +"개");
		System.out.println("십원 : "+ s1 +"개");
		System.out.println("일원 : "+ l1 +"개");
		
		
	}
}
