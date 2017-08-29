
@SuppressWarnings("serial")
public class IncorrectAgeException extends Exception {
	public IncorrectAgeException(){
		super();
	}
	public IncorrectAgeException(String msg){
		super(msg);
	}
	public IncorrectAgeException(String msg,Throwable clause){
		super(msg,clause);
	}
	public IncorrectAgeException(Throwable clause){
		super(clause);
	}
}
