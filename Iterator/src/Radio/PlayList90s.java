package Radio;
import java.util.ArrayList;

class PlayList90s {
	ArrayList<Item> songs;
	
	public PlayList90s(){
		songs = new ArrayList<Item>();
		addSong("Wind of change",false, 1995, "3:46");
		addSong("Wind",false, 1995, "3:46");
		addSong("Wind of change 2",false, 1995, "3:46");
		addSong("Wind of change 3",false, 1995, "3:46");
		addSong("Wind of change 4",false, 1995, "3:46");
	}
	private void addSong(String name, boolean romantic, int year, String length) {
		Item item = new Item(name,romantic,year,length);
		songs.add(item);
	}
	public Iterator createIterator90s() {
		return new Iterator90s(songs);
		
	}
	
}
