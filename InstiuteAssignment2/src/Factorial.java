import java.util.Scanner;
public class Factorial {
	public static void main(String[] args)
	  {
	    int fact = 1;
	     @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number:");
	    int no = sc.nextInt();
	    for (int i = 1; i <= no; i++) {
	      fact *= i;
	    }
	    System.out.println("Factorial is:" + fact);
	  }
}
