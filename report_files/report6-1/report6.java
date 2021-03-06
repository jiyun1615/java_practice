package report6;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class report6 {
	public static void main(String args[]) throws IOException, ClassNotFoundException{
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
			
			FileInputStream fis = null;
			
			fis = new FileInputStream("friends.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			int result = ois.readInt();
			Friends[] friends = new Friends[result];
			for(int i = 0; i<result; ++i)
			{
				friends[i] = (Friends) ois.readObject();
			}
			
			
			
			/*	
			ArrayList <Friends> result = new ArrayList<Friends>();
			try {
				for(;;) {
					result.add((Friends)ois.readObject());
				}
			} catch (EOFException e) {
				//end of steam
			}
			
			for(int i =0; i<result.size(); i++)
			{
				System.out.println(result.get(i));
			}
				*/
			//System.out.println((Friends)ois.readObject());
				
			
			
			System.out.print("Would you like to add new friend?(y/n)");
			s = stdin.next();
			ans = s.charAt(0);
		}
		
		System.out.println("Program Finished.");
	}
}
