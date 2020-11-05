import java.util.Scanner;

public class report3 {
	public static void main(String args[]) {
		int num[] = new int[10];
		Scanner stdin = new Scanner(System.in);
		for(int i=0; i<10; i++)
		{
			System.out.print("Á¤¼ö"+(i+1)+" = ");
			num[i] = stdin.nextInt();
		}
		for(int i=0; i<9; i++)
		{
			for(int j=i+1; j<10; j++)
				{
					if(num[i]>num[j])
					{
						int tmp;
						tmp = num[i];
						num[i]=num[j];
						num[j]=tmp;
					}
				}
		}
		
		for(int i=0; i<9; i++)
		{
			System.out.print(num[i]+", ");
		}
		System.out.println(num[9]);
		
	}
}