
@SuppressWarnings("serial")
public class IncorrectNationalalityException extends Exception {
	public IncorrectNationalalityException(){
		super();
	}
	public IncorrectNationalalityException(String msg){
		super(msg);
	}
	public IncorrectNationalalityException(String msg,Throwable clause){
		super(msg,clause);
	}
	public IncorrectNationalalityException(Throwable clause){
		super(clause);
	}
}
