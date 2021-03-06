package report4;
import java.util.Scanner;

public class report4{
	
	public static class Person {
		String name;
		String birth;
		String state;
		
		public Person()
		{
			name = "";
			birth = "";
			state = "";
		}
		public void create(String n)
		{
			name = n;
			System.out.println();
			System.out.println("객체가 생성되었습니다.");
			System.out.println();
		}
		public void create(String n, String b)
		{
			name = n;
			birth = b;
			System.out.println();
			System.out.println("객체가 생성되었습니다.");
			System.out.println();
		}
		public void create(String n, String b, String s)
		{
			name = n;
			birth = b;
			state = s;
			System.out.println();
			System.out.println("객체가 생성되었습니다.");
			System.out.println();
		}
		
		Scanner scan = new Scanner(System.in);
		public String nameIn()
		{
			System.out.print("입력1(이름) = ");
			String n;
			n = scan.nextLine();
			return n;
		}
		public String birthIn()
		{
			System.out.print("입력2(생년월일) = ");
			String b;
			b = scan.nextLine();
			return b;
		}
		public String stateIn()
		{
			System.out.print("입력3(출생지) = ");
			String s;
			s = scan.nextLine();
			return s;
		}
		
		public void printResult1() {
			System.out.println("객체정보");
			System.out.println("1. 이름: " + name);
		}
		
		public void printResult2() {
			System.out.println("객체정보");
			System.out.println("1. 이름: " + name);
			System.out.println("2. 생년월일: " + birth);
		}
		
		public void printResult3() {
			System.out.println("객체정보");
			if (name != "")
				System.out.println("1. 이름: " + name);
			if (birth != "")
				System.out.println("2. 생년월일: " + birth);
			if (state != "")
				System.out.print("3. 출생지: " + state);
		}
	}

	
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 항목은 몇 개 입니까? ");
		int num = scan.nextInt();
		
		String n1;
		String b1;
		String s1;
		Person p = new Person();
		
		switch (num) {
		case 1:
			n1 = p.nameIn();
			p.create(n1);
			p.printResult3();
			break;
		case 2:
			n1 = p.nameIn();
			b1 = p.birthIn();
			p.create(n1, b1);
			p.printResult3();
			break;
		case 3:
			n1 = p.nameIn();
			b1 = p.birthIn();
			s1 = p.stateIn();
			p.create(n1, b1, s1);
			p.printResult3();
			break;
		default:
			System.out.print("Error");
			break;
		}
		
	}


}
