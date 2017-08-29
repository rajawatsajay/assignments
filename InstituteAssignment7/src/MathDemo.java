import java.util.Scanner;
interface MyMath{
	double sqr(double a);
	double cube(double a);
	double cosine(double a);
	double sine(double a);
}
class ImplMath implements MyMath{
	public double sqr(double a) {
	  double sqr=Math.pow(a,2);
	  System.out.println("Square of number:"+sqr);
		return 0;
	}
	public double cube(double a) {
		double cube=Math.pow(a,3);
		  System.out.println("Cube of number:"+cube);
		return 0;
	}
	public double cosine(double a){
		double cosine=Math.cos(a);
		System.out.println("cosine of number:"+cosine);
		return 0;
	}
	public double sine(double a) {
		double sine=Math.sin(a);
		System.out.println("sine of number:"+sine);
		return 0;
	}
}
public class MathDemo {
public static void main(String []args){
	MyMath math=new ImplMath();
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	double n=sc.nextDouble();
	math.sqr(n);
	math.cube(n);
	math.cosine(n);
	math.sine(n);
}
}
