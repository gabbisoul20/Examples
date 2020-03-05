import java.util.ArrayList;

public class Plane {

	private String name;
	private int capacity;

	private ArrayList<String> routes;

	public Plane(String name, int capacity) {

		this.name = name;
		this.capacity = capacity;
		this.routes = new ArrayList<String>();

	}

	public void addRoute(String from, String to) {

		String build = from + "-" + to;

		this.routes.add(build);
	}

	public void printPlaneInfo() {

		System.out.println(this.name + " (" + this.capacity + " ppl)");

	}

	public void printPlaneRoutes() {

		for (String route : this.routes)
			System.out.println(this.name + " (" + this.capacity + " ppl) (" + route + ")");
	}

}
