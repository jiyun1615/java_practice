import java.util.Scanner;

public class report2 {
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ���: ");
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
		
		System.out.println("������ : "+ m5 + "��");
		System.out.println("���� : "+ m1 +"��");
		System.out.println("õ�� : "+ c1 +"��");
		System.out.println("����� : "+ b5 +"��");
		System.out.println("��� : "+ b1 +"��");
		System.out.println("�ʿ� : "+ s1 +"��");
		System.out.println("�Ͽ� : "+ l1 +"��");
		
		
	}
}
