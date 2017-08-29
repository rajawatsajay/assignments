import java.util.Scanner;

public class Number {
 int firstNumber;
 int secondNumber;
 double result;
public Number(int x, int y){
	firstNumber= x;
	secondNumber= y;
}
public void add(){
	int a=firstNumber;
    int b=secondNumber;
	 result=a+b;
	 System.out.println("Sum of two no:"+result);
 }
public void sub(){
	int a=firstNumber;
    int b=secondNumber;
	 result=a-b;
	 System.out.println("Subtraction of two no:"+result);
}
public void mul(){
	int a=firstNumber;
    int b=secondNumber;
	 result=a*b;
	 System.out.println("Multiply of two no:"+result);
}
public void div(){
	int a=firstNumber;
    int b=secondNumber;
    if(b==0)throw new ArithmeticException("divsion by zero is undefined");
	 result=a/b;
	 System.out.println("Division of two no:"+result);
}
public static void main(String []args){
	boolean exit=false; 
	while(!exit){
		System.out.println("press 1 for addition");
		System.out.println("press 2 for subtraction");
		System.out.println("press 3 for multipication");
		System.out.println("press 4 for division");
		System.out.println("press 5 to exit");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	switch(num){
	case 1:
	System.out.println("Enter first  number");
	int n1=sc.nextInt();
	System.out.println("Enter second number");
	int n2=sc.nextInt();
	Number number=new Number(n1,n2);
	number.add();
	break;
	case 2:
		System.out.println("Enter first  number");
		int n3=sc.nextInt();
		System.out.println("Enter second number");
		int n4=sc.nextInt();
		Number number1=new Number(n3,n4);
	    number1.sub();
	break;
	case 3:
		System.out.println("Enter first  number");
		int n5=sc.nextInt();
		System.out.println("Enter second number");
		int n6=sc.nextInt();
		Number number2=new Number(n5,n6);
     	number2.mul();
     	break;
	case 4:
		System.out.println("Enter first  number");
		int n7=sc.nextInt();
		System.out.println("Enter second number");
		int n8=sc.nextInt();
		Number number3=new Number(n7,n8);
	number3.div();
	break;
	case 5:
		exit=true;
		break;	
	}
}
}
} 