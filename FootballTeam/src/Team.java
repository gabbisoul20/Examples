import java.util.ArrayList;

public class Team {
	private String nameOfTeam;
	private ArrayList < Player> members;
	private int limitOfPlayers;
	
	public Team ( String name) {
		this.nameOfTeam = name;
		members = new ArrayList <Player> ();
		this.limitOfPlayers = 16;
	}

	public String getName () {
		return this.nameOfTeam;
	}
	
	public void setMaxSize ( int size ) {
		this.limitOfPlayers = size; 
	}
	
	public void addPlayer (Player member) {
		if ( this.members.size() <= this.limitOfPlayers - 1 )
			this.members.add( member );
	}

	public void printPlayers () {
		System.out.println("The team is made with:");
		
		 for ( Player member : this.members) {
			 System.out.println(member); 
		 }	 
	}

	public int size () {
		return this.members.size() ;
	}
	
	public int goals () {
		int count = 0;
		
		for ( Player member : this.members) 
			count += member.getGoals();
		
		return count;
	}
}
