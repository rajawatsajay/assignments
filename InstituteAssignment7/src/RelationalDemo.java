import java.util.Scanner;

interface  Relational{
	void greaterThan();
	void lessThan();
	void greaterThanEq();
	void lessThanEq();
}
class ImplRel implements Relational{
	int a,b;
	
	public ImplRel(int a, int b){
		this.a = a;
		this.b = b;
	}
	public void greaterThan() {	
	  if(a>b){
		 System.out.println("First no is greater Than second");
	  }else if(a==b){
	  
	  } else{
		  System.out.println("Second no is greater Than first");
	  }
	}
	public void lessThan() {
		 if(a<b){
			 System.out.println("First no is smallerThan second");
		  }else if(a==b){
		  }else{
		  System.out.println("Second no is smallerThan first");
		  }
	}
	public void greaterThanEq() {
		 if(a>=b){
			 System.out.println("First no is greaterThanEq second");
		  }else{
			  System.out.println("Second no is greaterThanEq Second");
		  }
	}
	public void lessThanEq() {
		 if(a<=b){
			 System.out.println("First no is smallerThanEq second");
		  }else{
			  System.out.println("Second no is smallerThanEq Second");
		  }
	}
	
}
public class RelationalDemo {
	public static void main(String []args){
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first no");
	int n1=sc.nextInt();
	System.out.println("Enter second no");
	int n2=sc.nextInt();
	Relational relational=new ImplRel(n1,n2);
	relational.greaterThan();
	relational.lessThan();
	relational.greaterThanEq();
	relational.lessThanEq();
	}
}
