package Radio;

public class Dj {
	PlayList80s songs80s;
	PlayList90s songs90s;
	
	public Dj(PlayList80s songs80s,PlayList90s songs90s) {
		new PlayList80s();
		new PlayList80s();
		this.songs80s = songs80s;
		this.songs90s = songs90s;
	}
	
	public void printMethod(){
		System.out.println("Songs of 80s:");
		Iterator songs80sIterator = songs80s.createIterator();
		print(songs80sIterator);
		System.out.println("Songs of 90s:");
		Iterator songs90sIterator = songs90s.createIterator90s();
		print(songs90sIterator);
	}

	public void print(Iterator iterator) {
		while(iterator.hasNext()){
			Item song = (Item)iterator.next();
			System.out.println(song.getName());
			System.out.println(song.getYear());
			System.out.println(song.getLength());
		}
		
	}
}
