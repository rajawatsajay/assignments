import java.util.Scanner;
public class TestEmployee {
	public static void main(String []args){
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of employee");
	int n=sc.nextInt();
	Employee[] staff=new Employee[n];
	for(int i=0;i<n;i++){
		System.out.println("Enter Employee ID : ");
		int empId = sc.nextInt();
		System.out.println("Enter Employee Salary");
		double empSalary = sc.nextDouble();
		System.out.println("Enter Employee Name : ");
		String empName = sc.next();
		staff[i]=new Employee(empId,empSalary,empName);
	}
	for(Employee s:staff){
		System.out.println(s);
	}
	}
}
class Employee{
	int id;
	double salary;
	String name;
	public Employee(int id,double salary, String name) {
		//super();
		this.id=id;
		this.salary = salary;
		this.name = name;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name
				+ "]";
	}
	
	
	
}