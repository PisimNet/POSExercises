package Radio;

public class RadioStation {

	public static void main(String[] args) {
		PlayList80s songs80s = new PlayList80s();
		PlayList90s songs90s = new PlayList90s();
		Dj Mike = new Dj(songs80s, songs90s);
		Mike.printMethod();
	}
}
