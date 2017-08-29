import java.util.Scanner;

class EmployeeDetails {
	int hrs;
	int rate;
	double salary;

	public EmployeeDetails() {
		hrs = 0;
		rate = 0;
		salary = 0.0;

	}

	public EmployeeDetails(int hrs, int rate) {
		this.hrs = hrs;
		this.rate = rate;
	}
	protected double computeSalary() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter working hours");
		int hrs = sc.nextInt();
		System.out.println("Enter rate per hours");
		int rate = sc.nextInt();
		salary = hrs * rate;
		System.out.println("Per day employee salary:" + salary);
		return salary;
	}
	public String toString() {
		return "EmployeeDetails [workingHours:" + hrs + ", ratePerHour:" + rate + ", perDaySalary:"
				+ salary + "]";
	}
}

public class WageEmployee extends EmployeeDetails {
	String name;
	String address;
	double salary;

	public WageEmployee() {
		name = null;
		address = null;
		@SuppressWarnings("unused")
		double salary = 0.0;
	}

	public WageEmployee(String name, String address, double salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public String toString() {
		return "WageEmployeeDetails[Name:" + name + ", Address:" + address
				+ ", Salary:" + salary + "]";
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name");
		String name = sc.next();
		System.out.println("Enter employee address");
		String address = sc.next();
		EmployeeDetails emp = new WageEmployee();
		double salary = emp.computeSalary();
		EmployeeDetails emp1 = new WageEmployee(name, address, salary);
		System.out.println(emp1);
	}
}
