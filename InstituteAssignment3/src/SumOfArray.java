import java.util.Scanner;


public class SumOfArray {
	public static void main(String []args){
		int a[]=new int[1];
		int b[]=new int[1];
		int c[]=new int[1];
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a[0]=sc.nextInt();
		System.out.println("Enter second number");
		b[0]=sc.nextInt();
		c[0]=a[0]+b[0];
		System.out.println("Sum of two array element:44"+c[0]);
	}

}
