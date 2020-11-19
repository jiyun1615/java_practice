package report6;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class report6 {
    
      public static void main(String args[]) throws IOException{
         FileOutputStream fos = null;
         ObjectOutputStream oos = null;
         String filename = "friends.txt";
         
         File file = new File(filename); 
         if( file.exists()) file.delete();
         
         ArrayList<Friends> friendsInput = new ArrayList<Friends>();
         
         Scanner stdin = new Scanner(System.in);
         System.out.print("Would you like to add new friend?(y/n)");
         String s = stdin.next();
         char ans = s.charAt(0); 
         while(ans == 'y'|| ans == 'Y')
         {
            
          System.out.print("Name : ");
            String name = stdin.next();
            
          System.out.print("Birth : ");
            String birth = stdin.next();
            
          System.out.print("Phone number : ");
            String phoneNumber = stdin.next();
                        
            Friends myFriend = new Friends(name, birth, phoneNumber);
            friendsInput.add(myFriend);
                        
            
            
            System.out.print("Would you like to add new friend?(y/n)");
            s = stdin.next();
            ans = s.charAt(0);
         }

            try {
               fos = new FileOutputStream(filename, true);
               oos = new ObjectOutputStream(fos);
               
               oos.writeObject(friendsInput);
               System.out.println("Save complited.");
               
               fos.close();
               oos.close();
            }
            catch(Exception e) {
               System.out.println("File not exist.");
            }
         

         ArrayList <Friends> friendsOutput = new ArrayList<Friends>();
         
         try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            friendsOutput = (ArrayList)ois.readObject();
            ois.close();
            fis.close();
                        
         }
         catch(Exception e) {
            System.out.println("File not exist..");
         }
         

         for(Friends friend: friendsOutput) {
             System.out.println(friend);            
         }
         
         System.out.println("Program Finished.");
      }
      
      
      
}
