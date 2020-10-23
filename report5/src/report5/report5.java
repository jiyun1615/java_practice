package report5;
import java.util.Scanner;


public class report5 {
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("나의 애완동물 : 1.개 2.고양이 3.햄스터 (선택)");
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
			System.out.println("숫자를 잘못 입력하셨습니다.");
		
		Print p = new Print();
		p.pintroduce(myAnimal);
		p.pplay(myAnimal1);
		
	}
}
