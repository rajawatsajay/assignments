import java.util.Scanner;

public class VoterMain {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Enter nationality");
		String nationality=sc.next();
		Voter vote = new Voter(age, name,nationality);
		try {
			vote.check(name,age);
			System.out.println("Registration successful");
			System.out.println(vote);
		} catch (IncorrectNationalalityException e) {
			e.printStackTrace();
		} catch (IncorrectAgeException e) {
			e.printStackTrace();
		}
	}
}

class Voter {
	int age;
	String name;
	String nationality;
	public Voter(int age,String name,String nationality) {
		this.age = age;
		this.name = name;
		this.nationality = nationality;
	}

	public String toString() {
		return "VoterDetails [ age=" +  ", name=" + name
				+ ",nationality=" + nationality+"]";
	}

	public void check(String name, int age)
			throws IncorrectAgeException,IncorrectNationalalityException {
		if (age < 18)
			throw new IncorrectAgeException("Age is below eighteen");
		if (!"indian".equalsIgnoreCase(nationality))
			throw new IncorrectNationalalityException("not indian");
	}
}