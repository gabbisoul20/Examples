import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		Airport airport = new Airport(reader);
		airport.airportMenu();
		airport.serviceMenu();

		reader.close();
	}

}
