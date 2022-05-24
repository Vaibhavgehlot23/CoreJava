package Exercise9_7;

public class Person {
	
		
	
	private String firstName = null;
	private String lastName = null;

	public Person() {
		System.out.println("default");
	}
	public Person(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

}
