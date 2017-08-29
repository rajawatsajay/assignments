import java.util.Scanner;
public class EligibleVote {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Person is eligible for vote");
		} else {
			System.out.println("Person is not eligible for vote");
		}
	}
}
