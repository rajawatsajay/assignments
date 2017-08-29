import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args)
	  {
	    int n1 = 1;int n2 = 1;int n3 = 0;
	    
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter range:");
	    int range = sc.nextInt();
	    System.out.print(n1 + " " + n2 + " ");
	    for (int i = 3; i <= range; i++)
	    {
	      n3 = n1 + n2;
	      n1 = n2;
	      n2 = n3;
	      System.out.print(n3 + " ");
	    }
	  }
}
