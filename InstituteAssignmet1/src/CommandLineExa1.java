
public class CommandLineExa1 {
	public static void main(String []args){
		int no1,no2;
		int add=0,subtract=0,multiply=0;
		float divide=0;
		no1=Integer.parseInt(args[0]);
		no2=Integer.parseInt(args[1]);
		System.out.println("value of no1 is:"+no1);
		System.out.println("value of no2 is:"+no2);
		add=no1+no2;
		System.out.println("add of two no is:"+add);
		subtract=no1-no2;
		System.out.println("subtraction of two no is:"+subtract);
		multiply=no1*no2;
		System.out.println("multiplication of two no is:"+multiply);
		divide=(float)no1/no2;
		System.out.println("division of two no is:"+divide);

		}

}
