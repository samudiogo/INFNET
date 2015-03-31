package entities;

import java.util.ArrayList;
import java.util.List;

public class Artist
{
	private String Name;
	private Gender Style;
	private ArrayList<Album> Albums = new ArrayList<Album>();
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name = name;
	}
	public Gender getStyle()
	{
		return Style;
	}
	public void setStyle(Gender style)
	{
		Style = style;
	}
	public ArrayList<Album> getAllAlbums()
	{
		return Albums;
	}
	
	public void setAlbums(ArrayList<Album> albums)
	{
		Albums = albums;
	}
	
	public boolean addAlbum(Album album)
	{
		if(Albums.add(album)) return true;
		//não adicinou...
		return false;
	}
	
	/**
	 * Partindo do principio que todos os meus artistas favoritos tem pelo menos um album...
	 * @param name
	 * @param style
	 * @param albums
	 */
	public Artist(String name, Gender style, Album album)
	{
		setName(name);
		setStyle(style);
		
		this.addAlbum(album);
	}
	@Override
	public String toString()
	{
		return String.format("Artist:\nName:%s Style: %s\n: %s", Name,
				Style.getDescription(), Albums);
	}
	
	
	public static void PrintRecentAlbum(ArrayList<Album> albums)
	{
		List<Album> aux = albums;
		aux.sort(null);
		System.out.println(aux.get(aux.size()-1));
	}
	
	public static void printArtistByGender(ArrayList<Artist> Alist, Gender gender)
	{
		for(Artist a: Alist)
			if(a.getStyle().equals(gender))
				System.out.println(a);
	}
	
	
}
