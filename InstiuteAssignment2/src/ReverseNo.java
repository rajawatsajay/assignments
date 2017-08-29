import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
		int rev = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int no = sc.nextInt();
		while (no != 0) {
			rev *= 10;
			rev += no % 10;
			no /= 10;
		}
		System.out.println(no);
		System.out.println("Reverse no:" + rev);
	}
}
