import java.util.Scanner;
public class Getinput {

	public static void main(String[] args) {
		Scanner apple = new Scanner(System.in);
		
		System.out.println("enter the your name: ");     //string
		String name =apple.nextLine();
		
		System.out.println("Enter you roll nuber: ");    //short
		short reg=apple.nextShort();
		apple.nextLine();            //before using the this function string will come
		
		System.out.println("enter the mail id");         //string
		String mailid=apple.nextLine();	
		
		System.out.println("Enter your mark");          //int
		int mark = apple.nextInt();
		                                             
		System.out.println("Enter you hight");          //float
		float hight = apple.nextFloat();
		
		System.out.println("Enter your initial");        //char
		char initial = apple.next().charAt(0);
		
		System.out.println("Enter you luck number");      //byte
        byte n=apple.nextByte();
        
        System.out.println("Enter your percentage");      //double
        double per =apple.nextDouble();
        
        System.out.println("Are you student");           //boolean
        boolean condition = apple.nextBoolean();
        
		
		
		
		
		
		System.out.println("Hello "+name);
		System.out.println("register number is"+reg);
		System.out.println("Your mailid is "+mailid);
		System.out.println(mark);
		System.out.println(hight);
		System.out.println(initial);
		System.out.println(n);
		System.out.println(per);
		System.out.println(condition);
		

	}

}
