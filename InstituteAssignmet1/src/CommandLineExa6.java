
public class CommandLineExa6 {
	public static void main(String []args){
		int no1,no2,no3,no4,no5;
		int sum=0;
		no1=Integer.parseInt(args[0]);
		no2=Integer.parseInt(args[1]);
		no3=Integer.parseInt(args[2]);
		no4=Integer.parseInt(args[3]);
		no5=Integer.parseInt(args[4]);
		System.out.println("first no is:"+no1);
		System.out.println("second no is:"+no2);
		System.out.println("third no is:"+no3);
		System.out.println("fourth no is:"+no4);
		System.out.println("fifth no is:"+no5);
		for(int i=0;i<5;i++){
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("sum of values:"+sum);

}
}