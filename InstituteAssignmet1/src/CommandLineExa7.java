
public class CommandLineExa7 {
	public static void main(String []args){
		int no,sum=0;
		no=Integer.parseInt(args[0]);
		System.out.println("number is:"+no);
		while(no!=0){
			sum=sum+no%10;
			no=no/10;
		}
		System.out.println("sum of digit is:"+sum);
	}
}
