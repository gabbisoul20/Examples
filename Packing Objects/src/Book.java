
public class Book implements ToBeStored {

	private String writer;
	private String cdName;
	private double weight;

	public Book(String writer, String cdName, double weight) {

		this.writer = writer;
		this.cdName = cdName;
		this.weight = weight;
	}

	public double getWeight() {

		return this.weight;
	}

	public String toSTring() {

		return this.writer + ": " + this.cdName;
	}

}
