import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void addNames (ArrayList<Students> list, Scanner reader) {

		while (true ) {
			System.out.print("Name: ");
			String name = reader.nextLine();
			
			if (name.contentEquals(""))
				break;
			 
			System.out.print("Number: ");
			String number = reader.nextLine();
			
			Students tmp = new Students ( name, number);
			
			//add it to the list
			list.add( tmp);
		}	
	}
	
	public static void main(String[] args) {
		ArrayList <Students> list = new ArrayList <Students> ();
		Scanner reader = new Scanner (System.in);
		
		System.out.println();
		
		addNames( list, reader);
		
		for( Students step: list)
			System.out.println(step);
		
		System.out.println();
		
		System.out.print("Give search term:");
		String search = reader.nextLine();

		System.out.println();
		System.out.println("Result");
		
		for( Students step : list) {
			if( step.getName().contains(search) )
				System.out.println(step);
		}
		reader.close();
	}
}
