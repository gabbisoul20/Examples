import java.util.ArrayList;

public class Box implements ToBeStored {

	private ArrayList<ToBeStored> items;
	private double weightLimit;

	public Box(double weightLimit) {

		items = new ArrayList<ToBeStored>();
		this.weightLimit = weightLimit;

	}

	public double getWeight() {

		// if it's empty weight is 0
		if (this.items.isEmpty())
			return 0;

		double weight = 0;

		for (ToBeStored item : this.items)

			weight += item.getWeight();

		return weight;
	}

	public void add(ToBeStored item) {

		if (this.getWeight() + item.getWeight() > this.weightLimit) {

			System.out.println("The Box is full already, can't add");
			return;
		}

		this.items.add(item);

	}

}
