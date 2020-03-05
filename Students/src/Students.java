

public class Students {
	private String name;
	private String studentNumber;
	
	public Students (String givenName, String givenNumber) {
		this.name = givenName;
		this.studentNumber = givenNumber;	
	}

	public String toString () {
		return this.name + " ( " + this.studentNumber + " )";
	}
	
	public String getName () {
		return this.name;
	}
	
	public String getStudentNumber() {
		return this.studentNumber;
	}
}
