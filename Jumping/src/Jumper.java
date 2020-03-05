import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Jumper implements Comparable<Jumper> {

	private String name;
	private int score;
	private ArrayList<Integer> lengths;

	public Jumper(String name, int score) {
		this.name = name;
		this.score = score;
		this.lengths = new ArrayList<Integer>();
	}

	public Jumper(String name) {
		this.name = name;
		this.score = 0;
		this.lengths = new ArrayList<Integer>();
	}

	public boolean equals(Object otherObject) {

		if (otherObject == null)
			return false;

		if (this.getClass() != otherObject.getClass())
			return false;

		Jumper secondObject = (Jumper) otherObject;
		if (this.name.equals(secondObject.name))
			return true;

		return false;
	}

	public int compareTo(Jumper jumper) {
		return jumper.score - this.score;
	}

	public String toString() {
		String result = this.name + " (" + this.score + " points)";
		return result;
	}

	public String getLengths() {
		if (this.lengths.isEmpty())
			return null;

		String result = "jump lengths: ";

		for (int length : this.lengths.subList(0, this.lengths.size() - 1))
			result += length + " m, ";

		result += this.lengths.get(this.lengths.size() - 1) + " m";

		return result;
	}

	public void doJump() {
		Random random = new Random();

		int length = 60 + random.nextInt(60);

		ArrayList<Integer> scores = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++)
			scores.add(10 + random.nextInt(10));

		System.out.println("  " + this.name);
		System.out.println("    length: " + length);
		System.out.println("    judge votes: " + scores);

		this.jumpResults(length, scores);

	}

	private void jumpResults(int length, ArrayList<Integer> scores) {
		this.lengths.add(length);

		Collections.sort(scores);

		scores.remove(0);
		scores.remove(scores.size() - 1);

		int result = length;

		for (int score : scores)
			result += score;

		this.score += result;

	}

}
