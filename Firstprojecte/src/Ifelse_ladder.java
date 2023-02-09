import java.util.Scanner;
public class Ifelse_ladder {
  
	public static void main(String[] args) {
		
		
		/* let be learn the else if ladder....
		 now we thw the students mark table 
		 
		 >=90 -__   O grade
		 80 to 89   A grade
		 70 to 79   B grade
		 60 to 69   c grade
		 50 to 59   D grade
		 < 50         fail		 
		*/

		int mark;
		
		Scanner apple = new Scanner(System.in);
		System.out.println("Enter the Student mark");
		mark = apple.nextInt();
		
		if(mark>=90)
		{
			System.out.println(mark + " O grade");
		}
		else if((mark>=80)&(mark<=89))
		{
			System.out.println(mark + " a grade");
		}
		else if((mark>=70)&(mark<=79))
		{
			System.out.println(mark +" B grade");
		}
		else if((mark>=60)&(mark<=69))
		{
			System.out.println(mark +" C grade");
		}
		else if((mark>=50)&(mark<=59))
		{
			System.out.println(mark + " D grade");
		}
		else
		{
			System.out.println(mark+" fail");
		}
	}

}
