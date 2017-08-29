import java.util.Scanner;


public class CalcAverage {
public double avgFirstN(int N){
	if(N<0)throw new IllegalArgumentException("Number is negative");
	int sum=0;
	for(int i=0;i<=N;i++){
	sum=sum+i;
	}
	double avg=sum/N;
	System.out.println("Average:"+avg);
	return 0;
}
public static void main(String []args){
	CalcAverage calc=new CalcAverage();
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int N=sc.nextInt();
	calc.avgFirstN(N);
}
}
