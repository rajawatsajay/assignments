import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int result = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int no = sc.nextInt();
		int orig = no;
		while (no != 0) {
			int digit = no % 10;
			result += digit * digit * digit;
			no /= 10;
		}
		if (orig == result) {
			System.out.println("Number is armStrong");
		} else {
			System.out.println("Number is not armStrong");
		}
	}
}
