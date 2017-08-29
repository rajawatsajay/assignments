public class Addition2{
	private static void add(int...args){
		int sum = 0;
		for(int n:args){
			sum=sum+n;
		}
		System.out.println("Sum of integer value:"+sum);
	}
	private static void add(double...args){
		double sum=0;
		for(double no:args){
			sum=sum+no;
		}
		System.out.println("Sum of double value:"+sum);
	}
	
    public static void main(String []args){
		add(14,42,34);
		add(4.4,5.4);
	}
}
