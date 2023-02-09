import java.util.Scanner;
public class Dowhile {

	public static void main(String[] args) {
		int i =1 ,num;
		Scanner apple = new Scanner(System.in);
		System.out.println("Enter the number of Stars: ");
		num= apple.nextInt();
		
		do{
			System.out.println("*");
			i++;
		}while(i<=num);
		
		

	}

}
