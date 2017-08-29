
public class Singleton {
private static  Singleton singletonObj;
private Singleton(){}
public synchronized static Singleton getInstance(){
	if(singletonObj==null){
	singletonObj=new Singleton();	
	}
	return singletonObj;
}
public static void main(String []args){
	@SuppressWarnings("unused")
	Singleton o1=Singleton.getInstance();
	@SuppressWarnings("unused")
	Singleton o2=Singleton.getInstance();
}
}
