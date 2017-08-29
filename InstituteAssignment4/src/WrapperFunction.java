import java.util.Scanner;
public class WrapperFunction {
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		Integer n=sc.nextInt();
	    System.out.println("Convert integer to binary"+Integer.toBinaryString(n));
	    System.out.println("Convert integer to hexadecimal:"+Integer.toHexString(n));
	    System.out.println("Convert integer to octal:"+Integer.toOctalString(n));
	}
}
