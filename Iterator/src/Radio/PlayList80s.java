package Radio;

class PlayList80s {
	Item[] songs;
	static final int MAX_SONG = 5;
	int number =0;
	
	public PlayList80s() {
		songs = new Item[MAX_SONG]; 
		addSong("Sunny",false, 1986, "2:15");
		addSong("Moon",true, 1983, "3:23");
		addSong("ouou",true, 1980, "1:14");
		addSong("song N 1",false, 1989, "2:38");
		addSong("Ole ola",false, 1987, "4:02");
	}
		public void addSong(String name, boolean romantic, int year, String length){
			Item song = new Item(name, romantic, year, length);
			if(number>=MAX_SONG){
				System.err.println("The playlist is full");
			}else{songs[number]=song;
			number = number+1;
			}
	}
		public Iterator createIterator(){
			return new Iterator80s(songs);
		}

}
