import java.util.Scanner;
public class Ifclass {

	public static void main(String[] args) {
		
		int num;
		
	  Scanner apple = new Scanner(System.in);
      System.out.println("Enter your reg number: ");
      num = apple.nextInt();
      
      // now we take a if ststements
      if((num>=0) &(num<=45) )
      {
    	  System.out.println("You are it depertment student");
      }
      else
      {
    	  System.out.println("!!Sorry you are not it student");
    	  
      }
	}

}
