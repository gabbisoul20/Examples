
public class Main {

	public static void main(String[] args) {

		Box mainBox = new Box((double) 100.0);
		Box secondaryBox = new Box(102);

		mainBox.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));
		secondaryBox.add(new Book("Robert Martin", "Clean Code", 1));
		secondaryBox.add(new Book("Kent Beck", "Test Driven Development", 0.7));

		mainBox.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
		mainBox.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
		secondaryBox.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

		System.out.println("\nThe weight of sec box is" + secondaryBox.getWeight());
		System.out.println("\nThe weight of primary box is" + mainBox.getWeight());

		mainBox.add(secondaryBox);
		System.out.println("\nThe weight of primary box is" + mainBox.getWeight());

	}

}