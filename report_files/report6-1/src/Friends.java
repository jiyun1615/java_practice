
import java.io.Serializable;

public class Friends implements Serializable{
   public String name;
   public String birth;
   public String phoneNumber;   
   
   //이해안감 override
   public String toString() {
      return ("Name : " + name + "\t Birth : " + birth + "\t Phone number : " + phoneNumber);
   }
   
}