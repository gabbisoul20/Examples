import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Competition {
	private ArrayList<Jumper> jumpers;
	private Scanner reader;

	public Competition(Scanner reader) {
		this.jumpers = new ArrayList<Jumper>();
		this.reader = reader;
	}

	public void startCompetition() {
		System.out.println("Kumpula ski jumping week\n");

		this.addPlayer();

		if (this.jumpers.isEmpty())
			return;

		System.out.println("\nThe tournament begins!\n");

		for (int i = 1;; i++) {

			System.out.print("Write \"jump\" to jump; otherwise you quit: ");
			String command = this.reader.nextLine();

			if (command.equals("jump")) {
				this.showJumpsRound(i);
				this.allJumpOnce();
				continue;
			}
			System.out.println("\nThanks!\n");
			break;
		}
		this.showResults();

	}

	private void addPlayer() {
		System.out.println(
				"Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

		while (true) {
			System.out.print("  Participant name: ");
			String player = this.reader.nextLine();
			
			if (player.isEmpty())
				break;

			Jumper tmp = new Jumper(player);

			if (this.jumpers.contains(tmp))
				continue;

			this.jumpers.add(tmp);
		}
	}

	private void showJumpsRound(int i) {
		System.out.println("\nRound " + i + "\n");
		System.out.println("Jumping order:");

		Collections.reverse(this.jumpers);

		for (int j = 0; j < this.jumpers.size(); j++)
			System.out.println("  " + (j + 1) + ". " + this.jumpers.get(j));

		System.out.println("\n Results of round " + i);

	}

	private void allJumpOnce() {
		if (this.jumpers.isEmpty())
			return;

		Collections.reverse(this.jumpers);

		for (Jumper jumper : this.jumpers) {
			jumper.doJump();
		}
	}

	public void showResults() {
		Collections.sort(this.jumpers);

		System.out.println("Tournament results:");
		System.out.printf("%-11s %s\n", "Position", "Name");
		for (int i = 0; i < this.jumpers.size(); i++) {
			System.out.printf("%-11s %s\n", (i + 1), this.jumpers.get(i));
			System.out.printf("%-11s %s\n", "", this.jumpers.get(i).getLengths());
		}
	}

}
