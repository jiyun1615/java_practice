package report6;

import java.io.Serializable;

public class Friends implements Serializable{
	   private String name;
	   private String birth;
	   private String phoneNumber;   
	   
	   public Friends(String name, String birth, String phoneNumber) {
	      this.name = name;
	      this.birth = birth;
	      this.phoneNumber = phoneNumber;
	   }

	   
	   public String toString() {
	      return ("Name : " + name + "\t Birth : " + birth + "\t Phone number : " + phoneNumber);
	   }
	}