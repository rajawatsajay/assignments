
public class CommandLineExa5 {
	public strictfp static void main(String []args){
		float basicSalary;
		float incomeTax=0;
		basicSalary=Float.parseFloat(args[0]);
		if(basicSalary>0&basicSalary<4000){
		incomeTax=(4*basicSalary)/100;
			System.out.println("incomeTax is:"+incomeTax);
		}
		else if(basicSalary>=4000&basicSalary<10000){
			incomeTax=(6*basicSalary)/100;
				System.out.println("incomeTax is:"+incomeTax);
			}
		else if(basicSalary>=10000&basicSalary<17000){
			incomeTax=(8*basicSalary)/100;
				System.out.println("incomeTax is:"+incomeTax);
			}
		else if(basicSalary>=17000&basicSalary<27000){
			incomeTax=(10*basicSalary)/100;
				System.out.println("incomeTax is:"+incomeTax);
			}
		else{
			incomeTax=(15*basicSalary)/100;
				System.out.println("incomeTax is:"+incomeTax);
			}
	}
}
