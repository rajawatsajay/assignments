abstract class Instrument {
	abstract protected void play();
}

class Piano extends Instrument {
	protected void play() {
		System.out.println("Piano is playing tan tan tan tan");
	}
}

class Flute extends Instrument {
	protected void play() {
		System.out.println("Flute is playing toot toot toot toot");
	}
}

class Guitar extends Instrument {
	protected void play() {
		System.out.println("Guitar is playing tin tin tin");
	}
}

public class MainInstrument {
	public static void main(String[] args) {
		Instrument[] Instrument = new Instrument[10];
		Instrument[0] = new Piano();
		Instrument[1] = new Flute();
		Instrument[2] = new Piano();
		Instrument[3] = new Guitar();
		Instrument[4] = new Guitar();
		Instrument[5] = new Flute();
		Instrument[6] = new Piano();
		Instrument[7] = new Guitar();
		Instrument[8] = new Flute();
		Instrument[9] = new Piano();
		for (int i = 0; i < 10; i++) {
			Instrument[i].play();

		}
		for (int i = 0; i < 10; i++) {
			if (Instrument[i] instanceof Piano) {
				System.out.println("Piano object stored index no:[" + i + "]");
			} else if (Instrument[i] instanceof Guitar) {
				System.out.println("Guitar object stored index no:[" + i + "]");
			} else {
				System.out.println("Flute object stored index no:[" + i + "]");
			}
		}
	}

}
