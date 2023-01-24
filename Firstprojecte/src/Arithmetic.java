import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner apple = new Scanner(System.in);
		System.out.println("Enter the two inputs: ");
		int a,b,c;
		a=apple.nextInt();
		b=apple.nextInt();
		
		c=a+b;
		c= a + b + a++ + b++ + ++a + ++b;
		System.out.println(c);
     
        System.out.println("the addition is: "+c);
    	c=a-b;
        System.out.println("the addition is: "+c);
    	c=a*b;
        System.out.println("the addition is: "+c);
    	c=a%b;
        System.out.println("the addition is: "+c);
    	c=a/b;
        System.out.println("the addition is: "+c);
	}

}
