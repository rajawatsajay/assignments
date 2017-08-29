import java.util.Scanner;
class Employee{
	int fixedSalary;
	int incentives;
	public double computeSalary(){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fixedSalary");
		int fixedSalary = sc.nextInt();
		System.out.println("Enter incentives");
		int incentives = sc.nextInt();
		double salary =fixedSalary+incentives ;
		System.out.println("Manager salary:" + salary);
		return salary;
	}
	
}
class Manager extends Employee{
	String name;
	String address;
	double salary;
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(String name, String address, double salary) {
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	public String toString() {
		return "ManagerDetails[Name:" + name + ", Address:" + address
				+ ", Salary:" + salary + "]";
	}
}
public class MainManger {
	public static void main(String []args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Manager name");
		String name = sc.next();
		System.out.println("Enter Manager address");
		String address = sc.next();
		Employee emp=new Manager();
		double salary=emp.computeSalary();
		Employee emp1=new Manager(name,address,salary);
		System.out.println(emp1);
		
	}
}
