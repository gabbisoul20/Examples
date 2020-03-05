
public class Player {
	private String name;
	private int goals;
	
	public Player ( String givenName) {
		this.name = givenName;
		this.goals = 0 ;
	}
	
	public Player (String givenName, int givenGoals) {
		this.name = givenName;
		this.goals = givenGoals;
	}
	
	public String getName () {
		return this.name;
	}

	public int getGoals () {
		return this.goals;
		
	}

	public String toString () {
		return "Player " +this.name + ", goals " + this.goals;
	}
}


