
import java.util.Scanner;
public class alphabets{
	
       public static void main(String[] args){
    	   
    	  char ch,ch1;
    	  Scanner scan=new Scanner(System.in); 
    	  
    	  System.out.print("Enter the Starting Alphabets: ");
    	  ch1=scan.next().charAt(0);
    	  
    	  for(ch=ch1; ch<='Z'; ch++){
    	  System.out.print(ch+" ");
          }
    	  
      }
       
}