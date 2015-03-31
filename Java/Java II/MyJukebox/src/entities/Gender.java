package entities;

public enum Gender
{
	 Erudita("Erudita")
	,RockProgressive("Rock Progressive")
	,Jazz("Jazz")
	,blues("blues")
	,Dubstep("Dubstep")
	,HouseMusic("House Music")
	,MPB("MPB");
	 
	private String Description;

	public String getDescription()
	{
		return Description;
	}

	public void setDescription(String description)
	{
		Description = description;
	}
	
	/**
	 * @param description
	 */
	private Gender(String description)
	{
		setDescription(description);
	}
	
	
}
