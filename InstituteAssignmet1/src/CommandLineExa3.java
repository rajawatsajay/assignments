
public class CommandLineExa3 {
	public static void main(String []args){
		double no1,no2;
		double add=0,subtract=0,multiply=0,divide=0;
		no1=Double.parseDouble(args[0]);
		no2=Double.parseDouble(args[1]);
		System.out.println("value of no1 is:"+no1);
		System.out.println("value of no2 is:"+no2);
		add=no1+no2;
		System.out.println("add of two no is:"+add);
		subtract=no1-no2;
		System.out.println("subtraction of two no is:"+subtract);
		multiply=no1*no2;
		System.out.println("multiplication of two no is:"+multiply);
		divide=no1/no2;
		System.out.println("division of two no is:"+divide);
	}

}
