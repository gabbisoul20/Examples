import java.util.ArrayList;

public class Library {

	private ArrayList <Book> books;
	
	public Library() {
		books = new ArrayList <Book> ();
	}
	
	public void addBook( String givenName, String givenPublisher, int givenYear) {
		this.books.add( new Book ( givenName, givenPublisher, givenYear)) ;
		
	}
	
	public void addBook( Book addedBook) {
		this.books.add(addedBook);
	}
	
	public void printBooks () {
		for (Book book :this.books)
			System.out.println(book);
	}
	
	public ArrayList<Book> searchByTitle(String title) {
		ArrayList <Book> tmp  = new ArrayList <Book> ();
		
		for( Book book : this.books) {
			if (book.title().toUpperCase().contains(title.toUpperCase().trim()))
				tmp.add( new Book (book.title(), book.publisher(), book.year()));
			
			
		}
		return tmp;
	}

	public ArrayList<Book> searchByPublisher(String publisher) {
		ArrayList <Book> tmp  = new ArrayList <Book> ();
		
		for( Book book : this.books) {
			if (book.publisher().toLowerCase().contains(publisher.toLowerCase().trim()))
				tmp.add( new Book (book.title(), book.publisher(), book.year()));
				
		}
		
		return tmp;
	}
	
	public ArrayList<Book> searchByYear(int year) {
		ArrayList <Book> tmp  = new ArrayList <Book> ();
		
		for( Book book : this.books) {
			if (book.year() == year)
				tmp.add(book);
				
		}
		return tmp;
	}
	
}
