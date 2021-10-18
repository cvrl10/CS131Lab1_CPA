public abstract class SportsTeam 
{
protected String teamName;
protected String teamMascot;
protected String headCoach;
protected int wins;
protected int losses;
	public SportsTeam()
	{
		teamName = "";
		teamMascot = "";
		headCoach = "";
		wins = 0;
		losses = 0;
	}
	public SportsTeam(String teamName, String teamMascot, String headCoach)
	{
		this.teamName = teamName;
		this.teamMascot = teamMascot;
		this.headCoach = headCoach;
		wins = 0;
		losses = 0;
	}
	public double getWinPercentage()
	{
		return (double)wins/(wins+losses);
	}
	public abstract double[] getStats();
}
