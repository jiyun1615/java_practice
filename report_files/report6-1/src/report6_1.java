import java.util.Scanner;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.util.ArrayList;

public class report6_1 {
	public static void main(String args[]) throws IOException{
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("Would you like to add new friend?(y/n)");
		String s = stdin.next();
		char ans = s.charAt(0);
		while(ans == 'y'|| ans == 'Y')
		{
			Friends myFriend = new Friends();
			System.out.print("Name : ");
			String name = stdin.next();
			myFriend.name = name;
			System.out.print("Birth : ");
			String birth = stdin.next();
			myFriend.birth = birth;
			System.out.print("Phone number : ");
			String phoneNumber = stdin.next();
			myFriend.phoneNumber = phoneNumber;
			
			try {
				fos = new FileOutputStream("friends.txt", true);
				oos = new ObjectOutputStream(fos);
				
				oos.writeObject(myFriend);
				System.out.println("Save complited.");
			}
			catch(Exception e) {
				System.out.println("File not exist.");
			}
			
			try {
				FileInputStream fis = new FileInputStream("friends.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis);
				
				ArrayList list = (ArrayList) ois.readObject();
				
				for(int i=0; i<list.size(); i++)
				{
					System.out.println(list.toString());
				}
				
			}
			catch(Exception e) {
				System.out.println("File not exist.");
			}
			
			System.out.print("Would you like to add new friend?(y/n)");
			s = stdin.next();
			ans = s.charAt(0);
		}
		
		System.out.println("Program Finished.");
	}
}