
@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception {
public InsufficientFundsException(){
	super();
}
public InsufficientFundsException(String msg){
	super(msg);
}
public InsufficientFundsException(String msg,Throwable clause){
	super(msg,clause);
}
public InsufficientFundsException(Throwable clause){
	super(clause);
}
}
