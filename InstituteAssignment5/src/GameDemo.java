class Game{
	Game(){
		System.out.println("Select the game type");
	}
}
class BoardGame extends Game{
	BoardGame(){
		System.out.println("select the game for playing");
	}
}
class Chess extends BoardGame{
	Chess(){
		System.out.println("Chess is playing");
	}
}
public class GameDemo {
public static void main(String args[]){
	@SuppressWarnings("unused")
	Chess ch=new Chess();
}
}
