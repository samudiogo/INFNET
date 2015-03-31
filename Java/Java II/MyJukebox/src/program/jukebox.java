package program;

import java.util.ArrayList;
import entities.*;

public class jukebox
{
	private static ArrayList<Artist> FavoriteArtists = new ArrayList<Artist>();

	public static void main(String[] args)
	{
		Artist PinkFloyd = new Artist("Pink Floyd", Gender.RockProgressive, new Album("Dark side of the moon", 1975));
		PinkFloyd.addAlbum(new Album("A sauceful of Screts", 1968));
		PinkFloyd.addAlbum(new Album("The divison Bell", 1995));
		
		Artist Yes = new Artist("Yes", Gender.RockProgressive, new Album("Yes", 1969));
		Artist Ufo = new Artist("Ufo", Gender.RockProgressive, new Album("The Early Years", 1994));
		
		
		Artist Janis = new Artist("Janis Joplin", Gender.blues, new Album("Pearl", 1971));
		Janis.addAlbum(new Album("I Got Dem Ol' Kozmic Blues Again Mama!",1969));
		Janis.addAlbum(new Album("Big Brother and the Holding Company",1967));
		
		FavoriteArtists.add(PinkFloyd);
		FavoriteArtists.add(Yes);
		FavoriteArtists.add(Ufo);
		
		FavoriteArtists.add(Janis);
		
		Artist.PrintRecentAlbum(PinkFloyd.getAllAlbums());
		Artist.printArtistByGender(FavoriteArtists, Gender.RockProgressive);	
	}

}
