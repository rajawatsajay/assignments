import java.util.Random;
import java.util.stream.IntStream;

class Medicine {
	public void displayLabel() {
		System.out.println("Company's name: Apollo");
		System.out.println("Company's address: Pune");

	}
}

class Tablet extends Medicine {
	public void displayLabel() {
		System.out.println("Tablets: store in a cool and dry place");
	}
}

class Syrup extends Medicine {
	public void displayLabel() {
		System.out.println("Syrup: kept closely tight in a cool place");
	}
}

class Ointment extends Medicine {
	public void displayLabel() {
		System.out.println("Ointment: For external use only");
	}
}

public class TestMedicine {
	public static void main(String []args){
Medicine []medicine=new Medicine[10];
medicine[0]=new Tablet();
medicine[1]=new Syrup();
medicine[2]=new Ointment();
medicine[3]=new Tablet();
medicine[4]=new Syrup();
medicine[5]=new Ointment();
medicine[6]=new Tablet();
medicine[7]=new Syrup();
medicine[8]=new Ointment();
medicine[9]=new Tablet();
Random random=new Random();
int x = random.nextInt(3)+1;
switch(x){
case 1:
 Medicine medicine1=new Tablet();
 medicine1.displayLabel();
 break;
case 2:
	 Medicine medicine2=new Syrup();
	 medicine2.displayLabel();
	 break;
case 3:
	 Medicine medicine3=new Ointment();
	 medicine3.displayLabel();
	 break;
}
}
}
