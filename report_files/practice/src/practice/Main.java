package practice;
import java.util.Scanner;

public class Main {
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  int seat = sc.nextInt();
	  int i;
	  int[] arr = new int[7];
	  for(i=0; i<7; i++)
	  {
		  arr[i] = sc.nextInt();
	  }
	  
	  int num=0;
	  for(i=0; i<7; i++)
	  {
		  num = num+arr[i];
	  }
	  
	  if(num < seat)
		  System.out.print(num);
	  else
		  System.out.print(seat);
  }
}