import java.util.Scanner;
public class Forloop {

	public static void main(String[] args) {
		Scanner apple = new Scanner(System.in);
		System.out.println("Enter the number of Stars ");
		
		int i,n;
		n = apple.nextInt();
	
		
		for(i=1;i<=n;++i) 
		{
			System.out.println("*");
			
		}

	}

}
