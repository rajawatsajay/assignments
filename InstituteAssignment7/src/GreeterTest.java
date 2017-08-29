import com.user.Advisor;
import com.user.Greeter;
public class GreeterTest {
	 public static void main(String []args){
		 for(int i=0;i<args.length;i++){
	     Greeter gret=new Greeter(args[i]);
	     gret.sayHello();
	    }
		 Advisor adviser=new Advisor();
		 adviser.getAdvice();
		 for(int i=args.length-1;i>=0;i--){
			 Greeter gret=new Greeter(args[i]);
			 gret.GoodBye();
		 }
}
}