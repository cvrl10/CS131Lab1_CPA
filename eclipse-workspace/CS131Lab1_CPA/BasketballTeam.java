public class  BasketballTeam extends SportsTeam
{
private int fieldGoals;
private int fieldGoalsAttempted;
private int freeThrows;
private int freeThrowsAttempted;
	public BasketballTeam()
	{
		super();
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}
	public BasketballTeam(String teamName, String teamMascot, String headCoach)
	{
		super(teamName, teamMascot, headCoach);
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}
	public double fieldGoalPercentage()
	{
		return (double)fieldGoals/fieldGoalsAttempted;
	}
	public double freeThrowPercentage()
	{
		return (double)freeThrows/freeThrowsAttempted;
	}
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted)
	{
		this.wins = wins;
		this.losses = losses;
		this.fieldGoals = fieldGoals;
		this.fieldGoalsAttempted = fieldGoalsAttempted;
		this.freeThrows = freeThrows;
		this.freeThrowsAttempted = freeThrowsAttempted; 
	}
	public double[] getStats()
	{
		double[] getStat = {getWinPercentage(), fieldGoalPercentage(), freeThrowPercentage()};
		return getStat;
	}
}
