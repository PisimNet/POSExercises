package Radio;

class Iterator80s implements Iterator {
	Item[] songs;
	int number=0;
	
	public Iterator80s(Item[] songs) {
		this.songs=songs;
	}
	
	@Override
	public boolean hasNext() {
		if (number>=songs.length||songs[number]==null)
		return false;
		else return true;
	}

	@Override
	public Object next(){
		Item song = songs[number];
		number=number+1;
		return song;
	}

}
