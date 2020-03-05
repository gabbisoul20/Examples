
public class Book {

	private String title;
	private String publisher;
	private int year;
	
	public Book (String givenTitle, String givenPublisher, int givenYear) {
		
		this.title = givenTitle;
		this.publisher = givenPublisher;
		this.year = givenYear;
		
	}
	
	public String title () {
		
		return this.title;
	}
	public String publisher () {
		
		return this.publisher;
	}

	public int year () {
		
		return this.year;
	}
	
	public String toString() {
		
		return this.title() + ", " +this.publisher() + ", " +this.year;
	}
}
