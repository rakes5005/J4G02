package assignment2;
import java.lang.*;
public class equal {
   public static void main(String[]args) {
	   String str1="viral";
	   String str2="SAILATHA";
	   String str3="SAILATHA";
	   System.out.println("str1 equals to str2:"+str1.equals(str2));
	   System.out.println("str1 equals to str3:"+str1.equals(str3));
	   
	   System.out.println("str1 equals to str2:"+str1.equals(str2));
	   System.out.println("str1 equals to str3:"+str1.equals(str3));
	   
	   System.out.println(str1.compareTo(str3));
	   System.out.println(str2.compareTo(str3));
	   
	   
	   System.out.println(str1.endsWith("al"));
	   System.out.println(str2.endsWith("HA"));
	  
		 
	   System.out.println(str1.startsWith("vi"));
	   System.out.println(str1.compareTo("SAI"));
		 
	   
   }

}
