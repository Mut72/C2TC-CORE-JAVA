import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		int i,j;
		int mark[][] = new int[3][3];
		Scanner apple = new Scanner(System.in);
		System.out.println("Enter the number of values: ");
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				mark[i][j] = apple.nextInt();
			}
			System.out.println(mark[i][j]);
		}
		
	}
}