import java.util.Random;

public class InterfaceTest1 {
	public static void main(String args[]) {
		Random r = new Random();
		FixedStack mystack1 = new FixedStack(10);
		for(int i=0; i<10; i++)
			mystack1.push(r.nextInt(10));
		System.out.println("½ºÅÃ : mystack1");
		for(int i=0; i<10; i++)
			System.out.print(mystack1.pop() + " ");
	}
}
