import java.util.Scanner;
public class Switch_statement {

	public static void main(String[] args) {
		
     // to identify the small and capital alphabet
		
		char letter;
		Scanner mango = new Scanner(System.in);
		System.out.println("Enter the any one alphabet letter :");
		letter = mango.next().charAt(0);

		
		if ((letter >=97)&(letter<=122))
		{
			System.out.println("It is a small letter");
		}
		else if((letter>=65)&(letter<=90))
		{
			System.out.println("it is a capital letter");
		}
		else
		{
			System.out.println("you are entered invalid input");
		}			
		

	}

}
