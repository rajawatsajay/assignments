import java.util.Scanner;

import static java.lang.Math.*;
public class MathFunction{
	public static void main(String []args){
		int a,b,p5,p6,p7,p8,m,s1c,s2c,m2c,s3c,s4c;
		double c=0,c1=0;
		double p1,p2,p3,p4,s1,s2,s3,s4,m1,m2,m5;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		//System.out.println("Calculate power using math function");
        p1=pow(a,3);
        p5=(int) p1;
        p2=pow(b,3);
        p6=(int) p2;
        p3=pow(a,2);
        p7=(int) p3;
        p4=pow(b,2);
        p8=(int) p4;
        s1=addExact(p5,p6);
        s1c=(int) s1;
        s2=addExact(p7,p8);
        s2c=(int) s2;
        m1=multiplyExact(a,b);
        m=(int) m1;
        s4=addExact(m,m);
        s4c=(int) s4;
        m5=multiplyExact(s1c,s4c);
        c1=m5/s2;
        m2=multiplyExact(2,m);
        m2c=(int) m2;
        s3=addExact(s2c,m2c);
        s3c=(int) s3;
        c=multiplyExact(s1c,s3c);
        System.out.println("(a³+b³)(a²+2ab+b²)="+c);
        System.out.println("(ab+ba)(a³+b³)/(a²+b²)="+c1);
        
	}
}