import java.util.Scanner;
public class LeapYear {
	 public static void main(String[] args)
	  {
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter year:");
	    int year = sc.nextInt();
	    if (year % 4 == 0) {
	      System.out.println("It's a leap year");
	    } else {
	      System.out.println("It's not a leap year ");
	    }
	  }
}
