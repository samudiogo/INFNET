package entities;

// se eu quero ordenar usando o Sort da Collection, eu preciso sobreescrever o método CompareTo
// e dizer que esta Classe ímplementa a interface Comparable passando ela mesma como parametro de tipo..
public class Album implements Comparable<Album>
{
	private String Title;
	private int Year;
	public String getTitle()
	{
		return Title;
	}
	public void setTitle(String title)
	{
		Title = title;
	}
	public int getYear()
	{
		return Year;
	}
	public void setYear(int year)
	{
		Year = year;
	}
	/**
	 * @param title
	 * @param year
	 */
	public Album(String title, int year)
	{
		setTitle(title);
		setYear(year);	
	}
	@Override
	public String toString()
	{
		return String.format("Album: \n Title:%s\t Year:%s\n", getTitle(), getYear());
	}
	@Override
	public int compareTo(Album o)
	{
		if(this.getYear() > o.getYear())
			return 1;
		else if(this.getYear() < o.getYear())
			return -1;
		return 0;
	}
	
		
	
}
