import java.util.Scanner;
public class Homework2 {

	public static void main(String[] args) {
	
		// to print the week days by using switch case
		int num;
		Scanner apple = new Scanner(System.in);
		System.out.println("Enter the number in the days :");
		num = apple.nextInt();
		
		switch(num)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Thuesday");
			break;
		case 3 :
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
		System.out.println("Only 7 day in a week sorry");
		}

	}

}
