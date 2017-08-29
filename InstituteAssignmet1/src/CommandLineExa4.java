
public class CommandLineExa4 {
	public strictfp static void main(String []args){
		float basicSalary;
		float DA=0,HRA=0;
		float GrossSalary=0;
		basicSalary=Float.parseFloat(args[0]);
		System.out.println("basicSalary is:"+basicSalary);
		DA=(20*basicSalary)/100;
		HRA=(30*basicSalary)/100;
		GrossSalary=basicSalary+DA+HRA;
		System.out.println("GrossSalary is:"+GrossSalary);
		
}
}
