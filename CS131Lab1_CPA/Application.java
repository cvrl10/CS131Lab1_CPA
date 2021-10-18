/**
 * This is the Application object that will launch our application
 * @author Rob Kelley
 * @version 1.3
 * Lab1 
 * CS131ON
 */
public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter();
		//Uncomment the line below to ensure reportStructure() method works after you have written it.
		System.out.println(npc.reportStructure());
		
		//GameCharacter gc = new GameCharacter();
		//System.out.println(gc.reportStructure());
		
		double i = Math.random()*4;
		for(int I = 0; I < 50; I++)
			System.out.println(npc.exclaim());
		BasketballTeam bt = new BasketballTeam();
		bt.setStats(33, 38, 47, 70, 5, 10);
		double[] stats = bt.getStats();
		
		for (double statistics : stats)
			System.out.println(statistics);
		
		
		
	}//end main

}//end class