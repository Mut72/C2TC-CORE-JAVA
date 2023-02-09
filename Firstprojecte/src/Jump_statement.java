import java.util.Scanner;
public class Jump_statement {

	public static void main(String[] args) {
		
		// for ex find the nearest number divisible by 10 that is less than or equal to n 

		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = scanner.nextInt();
		//76
		while(n>=0)
		{
			if(n%10==0)
			{
				System.out.println(n);
				break;                   //it is called as jump statement ons its condition is true it stop
			}
			--n;
		}
	}

}
