package report5;
import java.util.Scanner;


public class report5 {
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("���� �ֿϵ��� : 1.�� 2.����� 3.�ܽ��� (����)");
		int num = stdin.nextInt();
		
		Animal myAnimal = null;
		Happy myAnimal1 = null;
		
		if (num == 1) {
			myAnimal = new Dog();
			myAnimal1 = new Dog();
		}
		else if (num == 2) {
			myAnimal = new Cat();
			myAnimal1 = new Cat();
		}
		else if (num == 3) {
			myAnimal = new Hamster();
			myAnimal1 = new Hamster();
		}
		else 
			System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�.");
		
		Print p = new Print();
		p.pintroduce(myAnimal);
		p.pplay(myAnimal1);
		
	}
}
