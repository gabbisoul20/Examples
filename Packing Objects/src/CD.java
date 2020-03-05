
public class CD implements ToBeStored {

	private String artist;
	private String song;
	private int year;
	private double weight = 0.1;

	public CD(String artist, String song, int year) {

		this.artist = artist;
		this.song = song;
		this.year = year;

	}

	public double getWeight() {

		return this.weight;
	}

	public String toString() {

		return this.artist + ": " + this.song + " (" + this.year + ")";
	}
}
