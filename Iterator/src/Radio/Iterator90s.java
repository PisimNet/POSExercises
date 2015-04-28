package Radio;

import java.util.ArrayList;

public class Iterator90s implements Iterator {
	ArrayList<Item> songs;
	int position = 0;
	
	public Iterator90s(ArrayList<Item> songs){
		this.songs=songs;
	}

	@Override
	public boolean hasNext() {
		if (position >= songs.size())
		return false;
		else return true;
	}

	@Override
	public Object next() {
		Item song = (Item)songs.get(position);
		position=position+1;
		return song;
	}

}
