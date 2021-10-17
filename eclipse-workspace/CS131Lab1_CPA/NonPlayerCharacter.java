import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter
{
private boolean active;
private String intelligenceType;
	public NonPlayerCharacter()
	{
		super();
		setActive(false);
		setIntelligenceType("AVERAGE");
	}
	public NonPlayerCharacter(String uniqueID, String personality, boolean active, String intelligenceType )
	{
		super(uniqueID, personality);
		setActive(active);
		setIntelligenceType(intelligenceType);	
	}
	public boolean isActive()
	{
		return active;
	}
	public void setActive(boolean active) 
	{
		this.active = active;
	}
	public String getIntelligenceType() 
	{
		return intelligenceType;
	}
	public void setIntelligenceType(String intelligenceType)
	{
		this.intelligenceType = intelligenceType;
	}
	public String reportStructure()
	{
		StringBuilder sb = new StringBuilder(super.reportStructure());
		sb.append("Active: "+isActive()+"\n");
		sb.append("Intelligence: "+getIntelligenceType()+"\n");
		sb.append("==================================\n");
		return sb.toString();
	}
	public String introduce()
	{
		return "Hello my name is "+uniqueID;
	}
	public String exclaim()
	{
		String[] exclaim = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
		int i = (int)(Math.random()*5);
		return exclaim[i];
	}
}//end class
