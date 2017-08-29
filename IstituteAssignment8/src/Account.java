import java.util.Scanner;


public class Account {
	 int accNo;
		String name;
		int ammount;
		String branch;
		int currentAmmount;
		int withdral;
		public Account() {
			super();
		}
		public Account(int accNo, String name, int ammount,String branch) {
			this.accNo = accNo;
			this.name = name;
			this.ammount = ammount;
			this.branch=branch;
			
		}
		public String toString(){
			return "Account Number:"+"["+accNo+"]"+" "+"Acount Holder Name:"+"["+name+"]"+" "+"Ammount:"+"["+ammount+"]"+" "+"Branch:"+"["+branch+"]";
		}
		public void deposit(int ammount){
			System.out.println("Enter diposit ammount");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int dep=sc.nextInt();
			currentAmmount=ammount+dep;
			System.out.println("CurrentAmmount:"+currentAmmount);
		}
		public int withdrawl(int ammount) throws InsufficientFundsException{
			System.out.println("Enter withdrawl ammount");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int withdrawl=sc.nextInt();
			if(currentAmmount>=withdrawl){
			currentAmmount=currentAmmount-withdrawl;
			System.out.println("Withdrawl successfully");
			}
			if(currentAmmount<withdrawl)throw new InsufficientFundsException("Insufficient balance");
			return 0;
		}
		public static void main(String []args){
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter account number");
			 int accNo=sc.nextInt();
			 System.out.println("Enter accountholder name");
			 String name=sc.next();
			 System.out.println("Enter ammount");
			 int ammount=sc.nextInt();
			 System.out.println("Enter branch");
			 String branch=sc.next();
			Account myAccount=new Account(accNo,name,ammount,branch);
			System.out.println(myAccount);
			myAccount.deposit(ammount);
			try {
				myAccount.withdrawl(ammount);
			} catch (InsufficientFundsException e) {
				e.printStackTrace();
			}
			
		}


}
