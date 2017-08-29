import java.util.Scanner;

class WageEmployee{
	int sales;
	int commission;
	double TotalSalary;
	public double ComputeSalary(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter sales person salary");
		double salary=sc.nextDouble();
		System.out.println("Enter total sales ");
		sales=sc.nextInt();
		if (sales<500){
			commission=10;
		}
		else if (sales>=500 && sales <1000){
			commission=50;
		}
		else{
			commission=100;
		}
		TotalSalary=salary+commission;
		System.out.println("Total sales person salary"+TotalSalary);
		return TotalSalary;
	}
}
class SalesPerson extends WageEmployee{
	String name;
	String address;
	double salary;
	public SalesPerson() {
		// TODO Auto-generated constructor stub
	}
	public SalesPerson(String name, String address, double salary) {
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	public String toString() {
		return "SalesPersonDetails[Name:" + name + ", Address:" + address
				+ ", Salary:" + salary + "]";
	}
}
public class MainSalesPerson {
	public static void main(String []args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sales person name");
		String name = sc.next();
		System.out.println("Enter sales person address");
		String address = sc.next();
		WageEmployee emp=new SalesPerson();
		double salary=emp.ComputeSalary();
		WageEmployee salesPerson=new SalesPerson(name,address,salary);
		System.out.println(salesPerson);
}
}