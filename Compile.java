import java.util.regex.Matcher;  
import java.util.regex.Pattern; 

public class Compile
{
   public static void main(String[]args)
   {
      System.out.println("Hello");
      String test = "Hello"; 
      Pattern p = Pattern.compile(test); 
      
      System.out.println(p);
      
   }
}