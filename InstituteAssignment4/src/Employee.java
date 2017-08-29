import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Employee{
int id;
String name;
Date dob;
public Employee() {
	super();
}
public Employee(int id, String name, Date dob) {
	super();
	this.id = id;
	this.name = name;
	this.dob = dob;
}
@Override
public String toString() {
	return "EmployeeDetails [EmpId=" + id + ", EmpName=" + name + ", DateOfBirth=" + dob + "]";
}
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter EmpId");
	int id=scanner.nextInt();
	System.out.println("Enter EmpName");
	String name=scanner.next();
	System.out.println("Enter the Date ");
	String date = scanner.next();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	Date date2 = null;
	try {
		date2 = dateFormat.parse(date);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Employee emp = new Employee(id, name,date2);
	System.out.println(emp);
}
}
