import java.util.Scanner;
public class Whileloop {

	public static void main(String[] args) {
		Scanner apple = new Scanner(System.in);
		System.out.println("enter the number of Star ");
		int i ,n;
		n = apple.nextInt();
		
		i=1;
		while(i<=n) {
			
			System.out.println("*");
			i++;
			
		}
		

	}

}
