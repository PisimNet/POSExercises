package youtube_ex;

public class SongListGenerator {

	public static void main(String[] args) {
		SongComponent industrialMusic = new SongGroup("Industrial", 
				"some description about IM");
		SongComponent heavymMetalMusic = new SongGroup("\nHeavym Metal", 
				"some description about HM");
		SongComponent dubstepMusic = new SongGroup("\nDubstep",
				"some description about DM");
		
		SongComponent everySong = new SongGroup("Song List", 
				"Every song available"); 
		
		everySong.add(industrialMusic);
		
		industrialMusic.add(new Song("Head Like a Hole","NIN",1990));
		industrialMusic.add(new Song("HeadHunter","ront 242",1988));
		
		industrialMusic.add(dubstepMusic);
		
		dubstepMusic.add(new Song("Song name1","Knife party",2012));
		dubstepMusic.add(new Song("Song name2","Doctor P",2011));
		
		everySong.add(heavymMetalMusic);
		heavymMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
		heavymMetalMusic.add(new Song("Ace of Spides", "Motorhead", 1980));
		
		DiscJockey crasyLarry = new DiscJockey(everySong);
		
		crasyLarry.getSongList();
		

	}

}
