import java.util.HashMap;
import java.util.Scanner;

public class Airport {

	private HashMap<String, Plane> airport;
	private Scanner reader;


	public Airport(Scanner reader) {

		this.airport = new HashMap<String, Plane>();
		this.reader = reader;

	}

	private void addPlane() {

		// take name of plane
		System.out.print("Give plane ID: ");
		String name = this.reader.nextLine();

		// take capacity
		System.out.print("Give plane capacity: ");
		int capacity = Integer.parseInt(this.reader.nextLine());

		// create plane
		Plane tmp = new Plane(name, capacity);

		this.airport.put(name, tmp);

	}

	private void addRoute() {

		System.out.print("Give plane ID: ");
		String name = this.reader.nextLine();

		System.out.print("Give departure airport code: ");
		String from = this.reader.nextLine();

		System.out.print("Give destination airport code: ");
		String to = this.reader.nextLine();

		Plane tmp = airport.get(name);

		tmp.addRoute(from, to);
	}

	private void printPlanes() {

		for (Plane plane : this.airport.values())
			plane.printPlaneInfo();
	}

	private void printFull() {

		for (Plane plane : this.airport.values())
			plane.printPlaneRoutes();
	}

	private void printSpecificPlane() {

		// take name of plane
		System.out.print("Give plane ID: ");
		String name = this.reader.nextLine();

		this.airport.get(name).printPlaneInfo();
	}

	private void printAirportMenu() {

		System.out.println("Choose operation:\r\n" + "[1] Add airplane\r\n" + "[2] Add flight\r\n" + "[x] Exit");
		System.out.print("> ");

	}

	// print the serivces menu
	private void printServicesMenu() {

		System.out.println("Choose operation:\r\n" + "[1] Print planes\r\n" + "[2] Print flights\r\n"
				+ "[3] Print plane info\r\n" + "[x] Quit");

		System.out.print("> ");
	}

	public void airportMenu() {

		System.out.println("Airport panel\r\n" + "--------------------\n");

		boolean keepGoing = true;

		while (keepGoing) {

			// menu + command
			this.printAirportMenu();
			String command = this.reader.nextLine();

			switch (command) {

			case "1":
				this.addPlane();
				break;

			case "2":
				this.addRoute();
				break;

			case "x":
				keepGoing = false;
				System.out.println();
				break;
			}
		}
	}

	public void serviceMenu() {

		System.out.println("Flight service\r\n" + "------------\r\n");

		boolean keepGoing = true;

		while (keepGoing) {

			this.printServicesMenu();
			String command = this.reader.nextLine();

			switch (command) {

			case "1":
				this.printPlanes();
				break;

			case "2":
				this.printFull();
				break;

			case "3":
				this.printSpecificPlane();
				break;

			case "x":
				System.out.println();
				keepGoing = false;
				break;
			}
		}
	}
}
